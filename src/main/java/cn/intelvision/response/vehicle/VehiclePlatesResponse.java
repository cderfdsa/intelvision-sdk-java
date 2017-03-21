package cn.intelvision.response.vehicle;

import cn.intelvision.model.Plate;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehiclePlatesResponse extends ZenoResponse {

    private List<Plate> plates;

    public List<Plate> getPlates() {
        return plates;
    }

}
