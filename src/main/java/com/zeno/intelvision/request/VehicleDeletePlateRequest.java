package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VehicleDeletePlateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleDeletePlateRequest extends ZenoRequest<VehicleDeletePlateResponse> {

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
        return "/vehicle/delete_plate";
    }
}
