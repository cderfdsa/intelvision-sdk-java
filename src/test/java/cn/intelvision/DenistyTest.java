package cn.intelvision;

import cn.intelvision.request.density.DensityDetectRequest;
import cn.intelvision.response.density.DensityDetectResponse;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * 人员密度检测测试用例
 *
 * @author lanhuidong
 * @since 2016-11-19
 */
public class DenistyTest extends BaseTest {

    @Test
    public void test() {
        DensityDetectRequest request = new DensityDetectRequest();
        String path = DenistyTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "density.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(file);
        DensityDetectResponse response = zenoClient.execute(request);
        System.out.println(response.getNumber());
        assertNull(response.getErrorCode());
    }
}
