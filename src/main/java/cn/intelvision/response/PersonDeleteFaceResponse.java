package cn.intelvision.response;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonDeleteFaceResponse extends PersonDeleteResponse {
    private boolean success;
    private Integer deleted;

    @Override
    public Integer getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
