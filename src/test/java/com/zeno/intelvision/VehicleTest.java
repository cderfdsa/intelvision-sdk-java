package com.zeno.intelvision;

import com.zeno.intelvision.request.VehicleCreateRequest;
import com.zeno.intelvision.response.VehicleCreateResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author lanhuidong
 * @since 2016-11-14
 */
public class VehicleTest extends BaseTest {

    @Test
    public void testCreate() {
        VehicleCreateRequest request = new VehicleCreateRequest();
        request.setVehicleName("法拉利");
        request.setTag("Java SDK测试");
        request.setVehicleColor("红色");
        VehicleCreateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getVehicleId());
    }
}
