package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class RecognitionTest extends CreateAndDeleteBaseTest {

    private static String faceId2;
    private static String imageId2;

    @BeforeClass
    public static void add() {
        PersonAddFaceRequest personAddFaceRequest = new PersonAddFaceRequest();
        personAddFaceRequest.setFaceId(faceId);
        personAddFaceRequest.setPersonId(personId);
        PersonAddFaceResponse personAddFaceResponse = zenoClient.execute(personAddFaceRequest);
        assertEquals("person add face fail", true, personAddFaceResponse.isSuccess());

        FacesetAddFaceRequest facesetAddFaceRequest = new FacesetAddFaceRequest();
        facesetAddFaceRequest.setFaceId(faceId);
        facesetAddFaceRequest.setFacesetId(facesetId);
        FacesetAddFaceResponse facesetAddFaceResponse = zenoClient.execute(facesetAddFaceRequest);
        assertEquals("faceset add face fail", true, facesetAddFaceResponse.isSuccess());

        GroupAddPersonRequest groupAddPersonRequest = new GroupAddPersonRequest();
        groupAddPersonRequest.setGroupId(groupId);
        groupAddPersonRequest.setPersonId(personId);
        GroupAddPersonResponse groupAddPersonResponse = zenoClient.execute(groupAddPersonRequest);
        assertEquals("group add person fail", true, groupAddPersonResponse.isSuccess());

        TrainSearchRequest trainSearchRequest = new TrainSearchRequest();
        trainSearchRequest.setFacesetId(facesetId);
        TrainSearchResponse trainSearchResponse = zenoClient.execute(trainSearchRequest);
        assertNotNull(trainSearchResponse.getSessionId());

        TrainVerifyRequest trainVerifyRequest = new TrainVerifyRequest();
        trainVerifyRequest.setPersonId(personId);
        TrainVerifyResponse trainVerifyResponse = zenoClient.execute(trainVerifyRequest);
        assertNotNull(trainVerifyResponse.getSessionId());

        TrainIdentifyRequest trainIdentifyRequest = new TrainIdentifyRequest();
        trainIdentifyRequest.setGroupId(groupId);
        TrainIdentifyResponse trainIdentifyResponse = zenoClient.execute(trainIdentifyRequest);
        assertNotNull(trainIdentifyResponse.getSessionId());

        FaceDetectRequest faceDetectRequest = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            faceDetectRequest.setImg(file);
            FaceDetectResponse faceDetectResponse = zenoClient.execute(faceDetectRequest);
            assertNotNull(faceDetectResponse.getImageId());
            assertNotNull(faceDetectResponse.getFaces().get(0).getFaceId());
            imageId2 = faceDetectResponse.getImageId();
            faceId2 = faceDetectResponse.getFaces().get(0).getFaceId();
        }
    }

    @Test
    public void compare() {
        RecognitionCompareRequest request = new RecognitionCompareRequest();
        request.setFaceId1(faceId);
        request.setFaceId2(faceId2);
        RecognitionCompareResponse response = zenoClient.execute(request);
        assertNotNull(response.getRecognition().getRecognitionId());
    }

    @Test
    public void search() {
        RecognitionSearchRequest request = new RecognitionSearchRequest();
        request.setFaceId(faceId);
        request.setFacesetId(facesetId);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RecognitionSearchResponse response = zenoClient.execute(request);
        assertNotNull(response.getRecognition().getRecognitionId());
        assertNotNull(response.getRecognition().getCandidates().get(0).getFaceId());
    }

    @Test
    public void verify() {
        RecognitionVerifyRequest request = new RecognitionVerifyRequest();
        request.setFaceId(faceId);
        request.setPersonId(personId);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RecognitionVerifyResponse response = zenoClient.execute(request);
        assertNotNull(response.getRecognition().getRecognitionId());
        assertEquals(true, response.getRecognition().isSame());
    }

    @Test
    public void identify() {
        RecognitionIdentifyRequest request = new RecognitionIdentifyRequest();
        request.setFaceId(faceId);
        request.setGroupId(groupId);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RecognitionIdentifyResponse response = zenoClient.execute(request);
        assertNotNull(response.getRecognition().getRecognitionId());
        assertEquals(personId, response.getRecognition().getPersonId());
    }

    @Test
    public void detectSearch() {
        DetectSearchRequest request = new DetectSearchRequest();
        request.setFacesetId(facesetId);
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            request.setImg(file);
            DetectSearchResponse response = zenoClient.execute(request);
            assertNotNull(response.getRecognition().getRecognitionId());
        }
    }

    @Test
    public void detectVerify() {
        DetectVerifyRequest request = new DetectVerifyRequest();
        request.setPersonId(personId);
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            request.setImg(file);
            DetectVerifyResponse response = zenoClient.execute(request);
            assertNotNull(response.getRecognition().getRecognitionId());
        }
    }

    @Test
    public void detectIdentify() {
        DetectIdentifyRequest request = new DetectIdentifyRequest();
        request.setGroupId(groupId);
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            request.setImg(file);
            DetectIdentifyResponse response = zenoClient.execute(request);
            assertNotNull(response.getRecognition().getRecognitionId());
        }
    }

    @AfterClass
    public static void deleteImage() {
        ImageDeleteRequest request = new ImageDeleteRequest();
        request.setImageId(imageId2);
        ImageDeleteResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
