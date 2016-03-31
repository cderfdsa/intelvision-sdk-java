package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import com.zeno.intelvision.util.RandomString;
import org.junit.*;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by pc on 2016/3/18.
 */
public class VqdsTest extends BaseTest {
    private static String imageId1;
    private static String imageId2;
    private static String vqdsId;

    @BeforeClass
    public static void uploadAndCreate() {
        VqdsUploadRequest vqdsUploadRequest = new VqdsUploadRequest();
        String path = VqdsUploadRequest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "vqds1.jpg");
        if (file.exists()) {
            vqdsUploadRequest.setImg(file);
            VqdsUploadResponse vqdsUploadResponse = zenoClient.execute(vqdsUploadRequest);
            assertNotNull(vqdsUploadResponse.getImageId());
            imageId1 = vqdsUploadResponse.getImageId();
            file = new File(path, "vqds2.jpg");
            if (file.exists()) {
                vqdsUploadRequest.setImg(file);
                vqdsUploadResponse = zenoClient.execute(vqdsUploadRequest);
                assertNotNull(vqdsUploadResponse.getImageId());
                assertNotEquals(imageId1, vqdsUploadResponse.getImageId());
                imageId2 = vqdsUploadResponse.getImageId();
            }
        }

        VqdsCreateRequest vqdsCreateRequest = new VqdsCreateRequest();
        VqdsCreateResponse vqdsCreateResponse = zenoClient.execute(vqdsCreateRequest);
        assertNotNull(vqdsCreateResponse.getVqdsId());
        vqdsId = vqdsCreateResponse.getVqdsId();
    }

    @Before
    public void addImage() {
        VqdsAddImageRequest request = new VqdsAddImageRequest();
        request.setImageIds(imageId1 + "," + imageId2);
        request.setVqdsId(vqdsId);
        VqdsAddImageResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Test
    public void setInfo() {
        VqdsSetInfoRequest request = new VqdsSetInfoRequest();
        request.setVqdsId(vqdsId);
        request.setNewName(RandomString.getString(20));
        request.setTag("test");
        VqdsSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getVqdsId());
        assertEquals(vqdsId, response.getVqdsId());
        assertEquals("test", response.getTag());
    }

    @Test
    public void getInfo() {
        VqdsGetInfoRequest request = new VqdsGetInfoRequest();
        request.setVqdsId(vqdsId);
        VqdsGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getImages().get(0).getImageId());
    }

    @Test
    public void detect() {
        VqdsDetectRequest request = new VqdsDetectRequest();
        request.setImageIds(imageId1);
        request.setRefImageIds(imageId2);
        VqdsDetectResponse response = zenoClient.execute(request);
        assertNotNull(response.getColorCast());
    }

    @Test
    public void list() {
        VqdsListRequest request = new VqdsListRequest();
        VqdsListResponse response = zenoClient.execute(request);
        assertNotNull(response.getVqds().get(0).getVqdsId());
    }

    @After
    public void removeImage() {
        VqdsRemoveImageRequest request = new VqdsRemoveImageRequest();
        request.setImageIds(imageId1 + "," + imageId2);
        request.setVqdsId(vqdsId);
        VqdsRemoveImageResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @AfterClass
    public static void delete() {
        VqdsDeleteRequest request = new VqdsDeleteRequest();
        request.setVqdsIds(vqdsId);
        VqdsDeleteResponse response = zenoClient.execute(request);
        assertEquals(true,response.isSuccess());
    }
}
