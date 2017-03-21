package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetDeleteResponse extends ZenoResponse {

    private boolean success;
    private Integer deleted;

    public boolean isSuccess() {
        return success;
    }

    public Integer getDeleted() {
        return deleted;
    }

}
