package cn.intelvision;

import cn.intelvision.model.VQDS;
import cn.intelvision.request.vqds.*;
import cn.intelvision.response.vqds.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author lanhuidong
 * @since 2016-11-19
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VQDSTest extends BaseTest {

    private static String vqdsId;
    private static String imageId1;
    private static String imageId2;
    private static final String NAME = "IPC";
    private static final String NEW_NAME = "Zeno IPC";
    private static final String TAG = "Java SDK测试";

    @Test
    public void test1Create() {
        VqdsCreateRequest request = new VqdsCreateRequest();
        request.setName(NAME);
        request.setTag(TAG);
        VqdsCreateResponse response = zenoClient.execute(request);
        assertEquals(16, response.getVqdsId().length());
        vqdsId = response.getVqdsId();
    }

    @Test
    public void test2List() {
        VqdsListRequest request = new VqdsListRequest();
        VqdsListResponse response = zenoClient.execute(request);
        List<VQDS> vqdses = response.getVqds();
        assertEquals(1, vqdses.size());
        assertEquals(16, vqdses.get(0).getVqdsId().length());
    }

    @Test
    public void test3GetInfo() {
        VqdsGetInfoRequest request = new VqdsGetInfoRequest();
        request.setVqdsId(vqdsId);
        VqdsGetInfoResponse response = zenoClient.execute(request);
        assertEquals(NAME, response.getName());
    }

    @Test
    public void test4SetInfo() {
        VqdsSetInfoRequest request = new VqdsSetInfoRequest();
        request.setVqdsId(vqdsId);
        request.setNewName(NEW_NAME);
        VqdsSetInfoResponse response = zenoClient.execute(request);
        assertEquals(NEW_NAME, response.getName());
    }

    @Test
    public void test5Upload() {
        VqdsUploadRequest request1 = new VqdsUploadRequest();
        String path = VQDSTest.class.getClassLoader().getResource(".").getPath();
        File file1 = new File(path, "vqds1.jpg");
        request1.setImg(file1);
        VqdsUploadResponse response1 = zenoClient.execute(request1);
        imageId1 = response1.getImageId();
        assertEquals(16, imageId1.length());

        VqdsUploadRequest request2 = new VqdsUploadRequest();
        File file2 = new File(path, "vqds2.jpg");
        request2.setImg(file2);
        VqdsUploadResponse response2 = zenoClient.execute(request2);
        imageId2 = response2.getImageId();
        assertEquals(16, imageId2.length());
    }

    @Test
    public void test6AddImage() {
        VqdsAddImageRequest request = new VqdsAddImageRequest();
        request.setImageIds(imageId1 + "," + imageId2);
        request.setVqdsId(vqdsId);
        VqdsAddImageResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(2, response.getAdded());
    }

    @Test
    public void test7Detect() {
        VqdsDetectRequest request = new VqdsDetectRequest();
        request.setRefImageIds(imageId1 + "," + imageId2);
        request.setImageIds(imageId1);
        VqdsDetectResponse response = zenoClient.execute(request);
        assertEquals(0, response.getBlur());
        assertEquals(0, response.getShift());
        assertEquals("红", response.getColorCast());
    }

    @Test
    public void test8RemoveImage() {
        VqdsRemoveImageRequest request = new VqdsRemoveImageRequest();
        request.setVqdsName(vqdsId);
        request.setImageIds(imageId1 + "," + imageId2);
        VqdsRemoveImageResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(2, response.getRemoved());
    }

    @Test
    public void test9Delete() {
        VqdsDeleteRequest request = new VqdsDeleteRequest();
        request.setNames(NEW_NAME);
        VqdsDeleteResponse response = zenoClient.execute(request);
        assertTrue(response.isSuccess());
        assertEquals(1, response.getDeleted());
    }
}
