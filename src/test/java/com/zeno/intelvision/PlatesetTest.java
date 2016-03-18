package com.zeno.intelvision;

import com.zeno.intelvision.request.*;
import com.zeno.intelvision.response.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pc on 2016/3/18.
 */
public class PlatesetTest extends PlateBaseTest {

    @BeforeClass
    public static void addPlate() {
        PlatesetAddPlateRequest request = new PlatesetAddPlateRequest();
        request.setPlateId(plateId);
        request.setPlatesetId(platesetId);
        PlatesetAddPlateResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }

    @Test
    public void getInfo() {
        PlatesetGetInfoRequest request = new PlatesetGetInfoRequest();
        request.setPlatesetId(platesetId);
        PlatesetGetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlateset().getPlatesetId());
        assertEquals(platesetId, response.getPlateset().getPlatesetId());
    }

    @Test
    public void setInfo() {
        PlatesetSetInfoRequest request = new PlatesetSetInfoRequest();
        request.setPlatesetId(platesetId);
        request.setPlatesetName(platesetName);
        request.setTag("test");
        PlatesetSetInfoResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlateset().getPlatesetId());
        assertEquals(platesetId, response.getPlateset().getPlatesetId());
        assertEquals("test", response.getPlateset().getTag());
    }

    @Test
    public void plates() {
        PlatesetPlatesRequest request = new PlatesetPlatesRequest();
        request.setPlatesetId(platesetId);
        PlatesetPlatesResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlates().get(0).getPlateId());
        assertEquals(plateId, response.getPlates().get(0).getPlateId());
    }

    @Test
    public void list() {
        PlatesetListRequest request = new PlatesetListRequest();
        PlatesetListResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlatesets().get(0).getPlatesetId());
    }

    @Test
    public void search() {
        PlatesetSearchPlateRequest request = new PlatesetSearchPlateRequest();
        request.setPalteNumber(plateNumber);
        request.setPlatesetId(platesetId);
        PlatesetSearchPlateResponse response = zenoClient.execute(request);
        assertNotNull(response.getPlate().getPlateId());
        assertEquals(plateNumber, response.getPlate().getPlate());
    }

    @AfterClass
    public static void deletePlate() {
        PlatesetDeletePlateRequest request = new PlatesetDeletePlateRequest();
        request.setPlateId(plateId);
        request.setPlatesetId(platesetId);
        PlatesetDeletePlateResponse response = zenoClient.execute(request);
        assertEquals(true, response.isSuccess());
    }
}
