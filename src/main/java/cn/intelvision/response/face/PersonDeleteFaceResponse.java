package cn.intelvision.response.face;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonDeleteFaceResponse extends PersonDeleteResponse {
    private boolean success;
    private int deleted;

    @Override
    public int getDeleted() {
        return deleted;
    }

    @Override
    public void setDeleted(int deleted) {
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
