package cn.intelvision.response.vehicle;

import cn.intelvision.model.Vehicle;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamVehiclesResponse extends ZenoResponse {

    private List<Vehicle> vehicles;

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
