package com.zeno.intelvision;

import com.zeno.intelvision.request.FaceDetectRequest;
import com.zeno.intelvision.response.FaceDetectResponse;
import org.junit.BeforeClass;

import java.io.File;

import static org.junit.Assert.assertNotNull;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectTest extends BaseTest {

    protected static String imageId;
    protected static String faceId;

    @BeforeClass
    public static void detect() {
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            request.setImg(file);
            FaceDetectResponse response = zenoClient.execute(request);
            assertNotNull(response.getImageId());
            assertNotNull(response.getFaces().get(0).getFaceId());
            imageId = response.getImageId();
            faceId = response.getFaces().get(0).getFaceId();
        }
    }
}
