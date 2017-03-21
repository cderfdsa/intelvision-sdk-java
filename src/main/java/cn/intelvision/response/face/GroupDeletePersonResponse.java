package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupDeletePersonResponse extends ZenoResponse {

    private boolean success;
    private int deleted;

    public boolean isSuccess() {
        return success;
    }

    public int getDeleted() {
        return deleted;
    }

}
