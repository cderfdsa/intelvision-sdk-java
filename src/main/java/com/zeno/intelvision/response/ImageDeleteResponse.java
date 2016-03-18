package com.zeno.intelvision.response;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageDeleteResponse extends ZenoResponse {
    private boolean success;
    private Integer deleted;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
