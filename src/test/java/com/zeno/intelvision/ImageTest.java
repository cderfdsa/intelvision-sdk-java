package com.zeno.intelvision;

import com.zeno.intelvision.request.ImageDeleteRequest;
import com.zeno.intelvision.request.ImageFacesRequest;
import com.zeno.intelvision.request.ImageGetInfoRequest;
import com.zeno.intelvision.request.ImageSetInfoRequest;
import com.zeno.intelvision.response.ImageDeleteResponse;
import com.zeno.intelvision.response.ImageFacesResponse;
import com.zeno.intelvision.response.ImageGetInfoResponse;
import com.zeno.intelvision.response.ImageSetInfoResponse;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/17.
 */
public class ImageTest extends FaceDetectTest {

    @Test
    public void getInfo() {
        ImageGetInfoRequest request = new ImageGetInfoRequest();
        request.setImageId(imageId);
        ImageGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getImage().getImageId());
        assertEquals(imageId, response.getImage().getImageId());
    }

    @Test
    public void getFaces() {
        ImageFacesRequest request = new ImageFacesRequest();
        request.setImageId(imageId);
        ImageFacesResponse response = zenoClient.execute(request);
        assertNotNull(response.getFaces().get(0).getFaceId());
    }

    @Test
    public void setInfo() {
        ImageSetInfoRequest request = new ImageSetInfoRequest();
        request.setImageId(imageId);
        request.setTag("test");
        ImageSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getImage().getImageId());
        assertEquals("test", response.getImage().getTag());
    }

    @AfterClass
    public static void deleteImage() {
        ImageDeleteRequest request = new ImageDeleteRequest();
        request.setImageId(imageId);
        ImageDeleteResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
