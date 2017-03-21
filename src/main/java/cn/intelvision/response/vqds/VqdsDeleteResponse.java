package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsDeleteResponse extends ZenoResponse {

    private boolean success;
    private int deleted;

    public boolean isSuccess() {
        return success;
    }

    public int getDeleted() {
        return deleted;
    }

}
