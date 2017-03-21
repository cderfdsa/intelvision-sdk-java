package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetCreateResponse extends ZenoResponse {

    private boolean success;
    private String platesetId;

    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("plateset_id")
    public String getPlatesetId() {
        return platesetId;
    }

}
