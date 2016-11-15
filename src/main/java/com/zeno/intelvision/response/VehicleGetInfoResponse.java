package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Vehicle;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleGetInfoResponse extends ZenoResponse {

    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
