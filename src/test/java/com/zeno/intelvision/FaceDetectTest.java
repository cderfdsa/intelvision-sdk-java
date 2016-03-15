package com.zeno.intelvision;

import com.zeno.intelvision.request.FaceDetectRequest;
import com.zeno.intelvision.response.FaceDetectResponse;
import org.junit.Test;

import java.io.File;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectTest {

    @Test
    public void detect() {
        ZenoClient zenoClient = new DefaultZenoClient("testKey", "testSecret", "https://www.intelvision.cn/api");
        FaceDetectRequest request = new FaceDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "jordan.jpg");
        if (file.exists()) {
            request.setImg(file);
            FaceDetectResponse response = zenoClient.execute(request);
            System.out.println(response.getImageId());
        }
    }
}
