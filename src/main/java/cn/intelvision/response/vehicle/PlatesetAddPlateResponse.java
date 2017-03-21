package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetAddPlateResponse extends ZenoResponse {

    private boolean success;
    private Integer added;

    public boolean isSuccess() {
        return success;
    }

    public Integer getAdded() {
        return added;
    }

}
