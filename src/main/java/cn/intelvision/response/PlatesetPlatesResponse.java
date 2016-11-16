package cn.intelvision.response;

import cn.intelvision.model.Plate;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetPlatesResponse extends ZenoResponse {
    private List<Plate> plates;

    public List<Plate> getPlates() {
        return plates;
    }

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }
}
