package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetAddPlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetAddPlateRequest extends ZenoRequest<PlatesetAddPlateResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    @Param(name = "plate_id")
    private String plateId;

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/add_plate";
    }
}
