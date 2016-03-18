package com.zeno.intelvision;

import com.zeno.intelvision.request.PlateDetectRequest;
import com.zeno.intelvision.request.PlateInfoGetPlateRequest;
import com.zeno.intelvision.request.PlatesetCreateRequest;
import com.zeno.intelvision.request.PlatesetDeleteRequest;
import com.zeno.intelvision.response.PlateDetectResponse;
import com.zeno.intelvision.response.PlateInfoGetPlateResponse;
import com.zeno.intelvision.response.PlatesetCreateResponse;
import com.zeno.intelvision.response.PlatesetDeleteResponse;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class PlateBaseTest extends BaseTest {

    protected static String plateId;
    protected static String plateNumber;
    protected static String platesetId;
    protected static String platesetName;

    @BeforeClass
    public static void detectAndCreate() {
        PlateDetectRequest plateDetectRequest = new PlateDetectRequest();
        String path = PlateDetectRequest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "Benz.jpg");
        if (file.exists()) {
            plateDetectRequest.setImg(file);
            PlateDetectResponse plateDetectResponse = zenoClient.execute(plateDetectRequest);
            assertNotNull(plateDetectResponse.getPlateId());
            plateId = plateDetectResponse.getPlateId();
            assertNotNull(plateDetectResponse.getPlate().get(0).getPlate());
            plateNumber = plateDetectResponse.getPlate().get(0).getPlate();
        }

        PlatesetCreateRequest platesetCreateRequest = new PlatesetCreateRequest();
        platesetName = randomAlphanumeric(20);
        platesetCreateRequest.setPlatesetName(platesetName);
        PlatesetCreateResponse platesetCreateResponse = zenoClient.execute(platesetCreateRequest);
        assertNotNull(platesetCreateResponse.getPlatesetId());
        platesetId = platesetCreateResponse.getPlatesetId();
    }

    @Test
    public void getPlate() {
        PlateInfoGetPlateRequest request = new PlateInfoGetPlateRequest();
        request.setPlateId(plateId);
        PlateInfoGetPlateResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlates().get(0).getPlateId());
        assertEquals(plateId, response.getPlates().get(0).getPlateId());
    }

    @AfterClass
    public static void delete() {
        PlatesetDeleteRequest request = new PlatesetDeleteRequest();
        request.setPlatesetId(platesetId);
        PlatesetDeleteResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
