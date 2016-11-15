package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Plate;

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

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }
}
