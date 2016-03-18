package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class FaceTest extends CreateAndDeleteBaseTest {

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
    }

    @Test
    public void getInfo() {
        FaceGetInfoRequest request = new FaceGetInfoRequest();
        request.setFaceId(faceId);
        FaceGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getFace().getFaceId());
        assertEquals(faceId, response.getFace().getFaceId());
    }

    @Test
    public void setInfo() {
        FaceSetInfoRequest request = new FaceSetInfoRequest();
        request.setFaceId(faceId);
        request.setTag("test");
        FaceSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getFace().getFaceId());
        assertEquals("test", response.getFace().getTag());
    }

    @Test
    public void getPerson() {
        FaceGetPersonRequest request = new FaceGetPersonRequest();
        request.setFaceId(faceId);
        FaceGetPersonResponse response = zenoClient.execute(request);
        assertNotNull(response.getPerson().getPersonId());
        assertEquals(personId, response.getPerson().getPersonId());
    }

    @Test
    public void getImage() {
        FaceGetImageRequest request = new FaceGetImageRequest();
        request.setFaceId(faceId);
        FaceGetImageResponse response = zenoClient.execute(request);
        assertNotNull(response.getImage().getImageId());
        assertEquals(imageId, response.getImage().getImageId());
    }

    @Test
    public void getFaceset() {
        FaceGetFacesetRequest request = new FaceGetFacesetRequest();
        request.setFaceId(faceId);
        FaceGetFacesetResponse response = zenoClient.execute(request);
        assertNotNull(response.getFacesets().get(0).getFacesetId());
        assertEquals(facesetId, response.getFacesets().get(0).getFacesetId());
    }
}
