package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lanhuidong
 * @since 2016-11-14
 */
public class VehicleCreateResponse extends ZenoResponse {

    private boolean success;

    private String vehicleId;

    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("vehicle_id")
    public String getVehicleId() {
        return vehicleId;
    }

}
