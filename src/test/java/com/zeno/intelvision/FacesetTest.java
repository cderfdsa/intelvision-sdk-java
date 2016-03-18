package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class FacesetTest extends CreateAndDeleteBaseTest {

    @Before
    public void addFace() {
        FacesetAddFaceRequest request = new FacesetAddFaceRequest();
        request.setFaceId(faceId);
        request.setFacesetId(facesetId);
        FacesetAddFaceResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Test
    public void getInfo() {
        FacesetGetInfoRequest request = new FacesetGetInfoRequest();
        request.setFacesetId(facesetId);
        FacesetGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getFaceset().getFacesetId());
        assertEquals(facesetId, response.getFaceset().getFacesetId());
    }

    @Test
    public void setInfo() {
        FacesetSetInfoRequest request = new FacesetSetInfoRequest();
        request.setFacesetId(facesetId);
        request.setTag("test");
        request.setFacesetName(facesetName);
        FacesetSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getFaceset().getFacesetId());
        assertEquals(facesetId, response.getFaceset().getFacesetId());
        assertEquals("test", response.getFaceset().getTag());
    }

    @Test
    public void faces() {
        FacesetFacesRequest request = new FacesetFacesRequest();
        request.setFacesetId(facesetId);
        FacesetFacesResponse response = zenoClient.execute(request);
        assertNotNull(response.getFaces().get(0).getFaceId());
        assertEquals(faceId, response.getFaces().get(0).getFaceId());
    }

    @After
    public void deleteFace() {
        FacesetDeleteFaceRequest request = new FacesetDeleteFaceRequest();
        request.setFaceId(faceId);
        request.setFacesetId(facesetId);
        FacesetDeleteFaceResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
