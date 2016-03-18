package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PlatesetCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetCreateRequest extends ZenoRequest<PlatesetCreateResponse> {

    @Param(name = "plateset_name")
    private String platesetName;

    @Param(name = "tag")
    private String tag;

    public String getPlatesetName() {
        return platesetName;
    }

    public void setPlatesetName(String platesetName) {
        this.platesetName = platesetName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/create";
    }
}
