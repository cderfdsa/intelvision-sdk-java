package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.VehicleDeletePlateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleDeletePlateRequest extends ZenoRequest<VehicleDeletePlateResponse> {

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
        return "/vehicle/delete_plate";
    }
}
