package com.zeno.intelvision.response;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupAddPersonResponse extends ZenoResponse {
    private boolean success;
    private Integer added;

    public Integer getAdded() {
        return added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
