package com.zeno.intelvision.response;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleDeleteResponse extends ZenoResponse {

    private boolean success;

    private int deleted;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
