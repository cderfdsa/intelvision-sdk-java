package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlateInfoGetPlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateInfoGetPlateRequest extends ZenoRequest<PlateInfoGetPlateResponse> {

    @Param(name = "plate_id")
    private String plateId;

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/plate/info/get_plate";
    }
}
