package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupAddPersonResponse extends ZenoResponse {

    private boolean success;
    private int added;

    public int getAdded() {
        return added;
    }

    public boolean isSuccess() {
        return success;
    }

}
