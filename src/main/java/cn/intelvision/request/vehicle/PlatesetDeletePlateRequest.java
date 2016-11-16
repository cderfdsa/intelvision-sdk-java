package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetDeletePlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetDeletePlateRequest extends ZenoRequest<PlatesetDeletePlateResponse> {

    @Param(name = "plateset_id")
    private String platesetId;

    @Param(name = "plate_id")
    private String plateId;

    public String getPlatesetId() {
        return platesetId;
    }

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/plate/plateset/delete_plate";
    }
}
