package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetPlatesResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetPlatesRequest extends ZenoRequest<PlatesetPlatesResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/plates";
    }
}
