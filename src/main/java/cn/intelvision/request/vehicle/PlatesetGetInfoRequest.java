package cn.intelvision.request.vehicle;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetGetInfoResponse;
import cn.intelvision.annotation.Param;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetGetInfoRequest extends ZenoRequest<PlatesetGetInfoResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/get_info";
    }
}
