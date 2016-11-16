package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.VehicleDeleteResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleDeleteRequest extends ZenoRequest<VehicleDeleteResponse> {

    @Param(name = "vehicle_id")
    private String vehicleId;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String getApi() {
        return "/vehicle/delete";
    }
}
