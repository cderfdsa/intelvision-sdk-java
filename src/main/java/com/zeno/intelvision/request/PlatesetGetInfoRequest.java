package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlatesetGetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetGetInfoRequest extends ZenoRequest<PlatesetGetInfoResponse> {

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
        return "/plate/plateset/get_info";
    }
}
