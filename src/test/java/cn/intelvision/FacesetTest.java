package cn.intelvision;

import cn.intelvision.model.Face;
import cn.intelvision.model.Faceset;
import cn.intelvision.request.FaceDetectRequest;
import cn.intelvision.request.face.*;
import cn.intelvision.response.FaceDetectResponse;
import cn.intelvision.response.face.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.util.List;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacesetTest extends BaseTest {

    private static String facesetId;
    private static String faceId;
    private static final String FACESET_NAME = "研发部";
    private static final String NEW_FACESET_NAME = "财务部";
    private static final String TAG = "Java SDK测试";

    @BeforeClass
    public static void beforeClass() {
        BaseTest.beforeClass();
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        request.setImg(file);
        FaceDetectResponse response = zenoClient.execute(request);
        faceId = response.getFaces().get(0).getFaceId();
    }

    @Test
    public void test1Create() {
        FacesetCreateRequest request = new FacesetCreateRequest();
        request.setFacesetName(FACESET_NAME);
        request.setTag(TAG);
        FacesetCreateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(16, response.getFacesetId().length());
        facesetId = response.getFacesetId();
    }

    @Test
    public void test2GetInfo() {
        FacesetGetInfoRequest request = new FacesetGetInfoRequest();
        request.setFacesetId(facesetId);
        FacesetGetInfoResponse response = zenoClient.execute(request);
        Faceset faceset = response.getFaceset();
        Assert.assertEquals(16, faceset.getFacesetId().length());
        Assert.assertEquals(16, faceset.getAppId().length());
        Assert.assertTrue(faceset.getAddTime() > 0);
        Assert.assertEquals(FACESET_NAME, faceset.getFacesetName());
        Assert.assertEquals(TAG, faceset.getTag());
    }

    @Test
    public void test3SetInfo() {
        FacesetSetInfoRequest request = new FacesetSetInfoRequest();
        request.setFacesetId(facesetId);
        request.setFacesetName(NEW_FACESET_NAME);
        FacesetSetInfoResponse response = zenoClient.execute(request);
        Faceset faceset = response.getFaceset();
        Assert.assertEquals(16, faceset.getFacesetId().length());
        Assert.assertEquals(16, faceset.getAppId().length());
        Assert.assertTrue(faceset.getAddTime() > 0);
        Assert.assertEquals(NEW_FACESET_NAME, faceset.getFacesetName());
        Assert.assertEquals(TAG, faceset.getTag());
    }

    @Test
    public void test4AddFace() {
        FacesetAddFaceRequest request = new FacesetAddFaceRequest();
        request.setFacesetId(facesetId);
        request.setFaceId(faceId);
        FacesetAddFaceResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getAdded());
    }

    @Test
    public void test5Faces() {
        FacesetFacesRequest request = new FacesetFacesRequest();
        request.setFacesetId(facesetId);
        FacesetFacesResponse response = zenoClient.execute(request);
        Assert.assertNotNull(response);
        List<Face> faces = response.getFaces();
        Assert.assertEquals(1, faces.size());
        Face face = faces.get(0);
        Assert.assertEquals(16, face.getFaceId().length());
        Assert.assertEquals(16, face.getAppId().length());
        Assert.assertTrue(face.getAddTime() > 0);
    }

    @Test
    public void test6DeleteFace() {
        FacesetDeleteFaceRequest request = new FacesetDeleteFaceRequest();
        request.setFacesetId(facesetId);
        request.setFaceId(faceId);
        FacesetDeleteFaceResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }

    @Test
    public void test7Delete() {
        FacesetDeleteRequest request = new FacesetDeleteRequest();
        request.setFacesetId(facesetId);
        FacesetDeleteResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }
}
