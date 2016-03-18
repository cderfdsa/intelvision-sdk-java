package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Plateset;

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
