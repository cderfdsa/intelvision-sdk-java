package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Plate;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateInfoGetPlateResponse extends ZenoResponse {
    private List<Plate> plates;

    public List<Plate> getPlates() {
        return plates;
    }

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }
}
