package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.VehicleAddPlateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleAddPlateRequest extends ZenoRequest<VehicleAddPlateResponse> {

    @Param(name = "vehicle_id")
    private String vehicleId;

    @Param(name = "plate_id")
    private String plateId;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/vehicle/add_plate";
    }
}
