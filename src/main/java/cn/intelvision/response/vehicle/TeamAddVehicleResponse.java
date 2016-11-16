package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamAddVehicleResponse extends ZenoResponse {

    private boolean success;
    private int added;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getAdded() {
        return added;
    }

    public void setAdded(int added) {
        this.added = added;
    }
}
