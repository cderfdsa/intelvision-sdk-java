package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonDeleteFaceResponse extends ZenoResponse {

    private boolean success;
    private int deleted;

    public int getDeleted() {
        return deleted;
    }

    public boolean isSuccess() {
        return success;
    }

}
