package cn.intelvision.request;

import cn.intelvision.response.PlatesetGetInfoResponse;
import cn.intelvision.annotation.Param;

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
