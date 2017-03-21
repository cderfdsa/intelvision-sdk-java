package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetCreateRequest extends ZenoRequest<PlatesetCreateResponse> {

    @Param(name = "plateset_name")
    private String platesetName;

    @Param(name = "tag")
    private String tag;

    public void setPlatesetName(String platesetName) {
        this.platesetName = platesetName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/create";
    }
}
