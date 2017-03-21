package cn.intelvision.response.vehicle;

import cn.intelvision.model.Plate;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetPlatesResponse extends ZenoResponse {

    private List<Plate> plates;

    public List<Plate> getPlates() {
        return plates;
    }

}
