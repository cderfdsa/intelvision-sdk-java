package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlatesetDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetDeleteRequest extends ZenoRequest<PlatesetDeleteResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    public String getPlatesetId() {
        return platesetId;
    }

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/delete";
    }
}
