package cn.intelvision;

import cn.intelvision.model.Vehicle;
import cn.intelvision.request.vehicle.*;
import cn.intelvision.response.vehicle.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * @author lanhuidong
 * @since 2016-11-14
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleTest extends BaseTest {

    private static String vehicleId;
    private static String plateId;
    private static final String VEHICLE_NAME = "法拉利";
    private static final String TAG = "Java SDK测试";
    private static final String VEHICLE_COLOR = "红色";
    private static final String PURCHASE_DATE = "2016-11-15";
    private static final String PLA_NUMBER = "浙A88888";

    @BeforeClass
    public static void beforeClass() {
        BaseTest.beforeClass();
        PlateDetectRequest request = new PlateDetectRequest();
        String path = FaceDetectTest.class.getClassLoader().getResource(".").getPath();
        File file = new File(path, "Benz.jpg");
        assertTrue("image is not exists.", file.exists());
        request.setImg(file);
        PlateDetectResponse response = zenoClient.execute(request);
        plateId = response.getPlate().get(0).getPlateId();
    }

    @Test
    public void test1Create() {
        VehicleCreateRequest request = new VehicleCreateRequest();
        request.setVehicleName(VEHICLE_NAME);
        request.setTag(TAG);
        request.setVehicleColor(VEHICLE_COLOR);
        VehicleCreateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getVehicleId());
        vehicleId = response.getVehicleId();
    }

    @Test
    public void test2GetInfo() {
        VehicleGetInfoRequest request = new VehicleGetInfoRequest();
        request.setVehicleId(vehicleId);
        VehicleGetInfoResponse response = zenoClient.execute(request);
        Vehicle vehicle = response.getVehicle();
        Assert.assertNotNull(vehicle);
        Assert.assertEquals(VEHICLE_NAME, vehicle.getVehicleName());
        Assert.assertEquals(TAG, vehicle.getTag());
        Assert.assertEquals(VEHICLE_COLOR, vehicle.getVehicleColor());
    }

    @Test
    public void test3SetInfo() {
        VehicleSetInfoRequest request = new VehicleSetInfoRequest();
        request.setVehicleId(vehicleId);
        request.setVehicleName(VEHICLE_NAME);
        request.setPurchaseDate(PURCHASE_DATE);
        request.setPlaNumber(PLA_NUMBER);
        VehicleSetInfoResponse response = zenoClient.execute(request);
        Vehicle vehicle = response.getVehicle();
        Assert.assertNotNull(vehicle);
        Assert.assertEquals(PURCHASE_DATE, vehicle.getPurchaseDate());
        Assert.assertEquals(PLA_NUMBER, vehicle.getPlaNumber());
    }

    @Test
    public void test4AddPlate() {
        VehicleAddPlateRequest request = new VehicleAddPlateRequest();
        request.setVehicleId(vehicleId);
        request.setPlateId(plateId);
        VehicleAddPlateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getAdded());
    }

    @Test
    public void test5Plates() {
        VehiclePlatesRequest request = new VehiclePlatesRequest();
        request.setVehicleId(vehicleId);
        VehiclePlatesResponse response = zenoClient.execute(request);
        Assert.assertEquals(1, response.getPlates().size());
    }

    @Test
    public void test6DeletePlate() {
        VehicleDeletePlateRequest request = new VehicleDeletePlateRequest();
        request.setVehicleId(vehicleId);
        request.setPlateId(plateId);
        VehicleDeletePlateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }

    @Test
    public void test7Delete() {
        VehicleDeleteRequest request = new VehicleDeleteRequest();
        request.setVehicleId(vehicleId);
        VehicleDeleteResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }

}
