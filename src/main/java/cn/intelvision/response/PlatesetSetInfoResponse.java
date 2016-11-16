package cn.intelvision.response;

import cn.intelvision.model.Plateset;

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
