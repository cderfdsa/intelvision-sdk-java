package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.VehicleAddPlateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleAddPlateRequest extends ZenoRequest<VehicleAddPlateResponse> {

    @Param(name = "vehicle_id")
    private String vehicleId;

    @Param(name = "plate_id")
    private String plateId;

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/vehicle/add_plate";
    }
}
