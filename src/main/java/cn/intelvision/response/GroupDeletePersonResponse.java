package cn.intelvision.response;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupDeletePersonResponse extends ZenoResponse {
    private boolean success;
    private Integer delete;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}
