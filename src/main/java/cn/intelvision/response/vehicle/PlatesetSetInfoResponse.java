package cn.intelvision.response.vehicle;

import cn.intelvision.model.Plateset;
import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetSetInfoResponse extends ZenoResponse {
    private Plateset plateset;

    public Plateset getPlateset() {
        return plateset;
    }

    public void setPlateset(Plateset plateset) {
        this.plateset = plateset;
    }
}
