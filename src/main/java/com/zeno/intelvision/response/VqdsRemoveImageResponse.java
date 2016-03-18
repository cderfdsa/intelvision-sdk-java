package com.zeno.intelvision.response;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsRemoveImageResponse extends ZenoResponse {
    private boolean success;
    private Integer removed;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getRemoved() {
        return removed;
    }

    public void setRemoved(Integer removed) {
        this.removed = removed;
    }
}
