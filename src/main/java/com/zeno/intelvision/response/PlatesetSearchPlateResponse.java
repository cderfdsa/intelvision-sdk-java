package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Plate;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetSearchPlateResponse extends ZenoResponse{
    private Plate plate;

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }
}
