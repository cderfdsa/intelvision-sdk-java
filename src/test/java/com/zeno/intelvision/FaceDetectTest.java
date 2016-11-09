package com.zeno.intelvision;

import com.zeno.intelvision.request.FaceDetectRequest;
import com.zeno.intelvision.request.FaceLandmarkRequest;
import com.zeno.intelvision.response.FaceDetectResponse;
import com.zeno.intelvision.response.FaceLandmarkResponse;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectTest extends BaseTest {

    @Test
    public void testDetect() {
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(file);
        String tag = "jordan";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getImageId());
        assertEquals(16, response.getImageId().length());
        assertEquals(tag, response.getTag());
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(16, response.getFaces().get(0).getFaceId().length());
    }

    @Test
    public void testLandmark(){
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(file);
        String tag = "jordan";
        request.setTag(tag);
        FaceDetectResponse response = zenoClient.execute(request);
        String faceId = response.getFaces().get(0).getFaceId();

        FaceLandmarkRequest landmarkRequest = new FaceLandmarkRequest();
        landmarkRequest.setFaceId(faceId);
        FaceLandmarkResponse landmarkResponse = zenoClient.execute(landmarkRequest);
        landmarkResponse.getPoints();
    }
}
