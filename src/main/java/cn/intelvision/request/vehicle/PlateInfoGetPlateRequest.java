package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlateInfoGetPlateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateInfoGetPlateRequest extends ZenoRequest<PlateInfoGetPlateResponse> {

    @Param(name = "plate_id")
    private String plateId;

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    @Override
    public String getApi() {
        return "/plate/info/get_plate";
    }
}
