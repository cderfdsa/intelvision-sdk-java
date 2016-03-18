package com.zeno.intelvision;

import com.zeno.intelvision.request.DensityDetectRequest;
import com.zeno.intelvision.response.DensityDetectResponse;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class DensityTest extends BaseTest {

    @Test
    public void detect() {
        DensityDetectRequest request = new DensityDetectRequest();
        String path = DensityDetectRequest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "density.jpg");
        if (file.exists()) {
            request.setImg(file);
            DensityDetectResponse response = zenoClient.execute(request);
            assertNotNull(response.getNumber());
        }
    }
}
