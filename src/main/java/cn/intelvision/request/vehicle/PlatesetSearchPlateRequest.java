package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetSearchPlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetSearchPlateRequest extends ZenoRequest<PlatesetSearchPlateResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    @Param(name = "plate_number")
    private String palteNumber;

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    public void setPalteNumber(String palteNumber) {
        this.palteNumber = palteNumber;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/search";
    }
}
