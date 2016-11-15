package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VehicleDeleteResponse;

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
