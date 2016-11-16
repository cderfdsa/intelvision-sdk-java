package cn.intelvision.response.vehicle;

import cn.intelvision.model.Plateset;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetListResponse extends ZenoResponse {
    private List<Plateset> platesets;

    public List<Plateset> getPlatesets() {
        return platesets;
    }

    public void setPlatesets(List<Plateset> platesets) {
        this.platesets = platesets;
    }
}
