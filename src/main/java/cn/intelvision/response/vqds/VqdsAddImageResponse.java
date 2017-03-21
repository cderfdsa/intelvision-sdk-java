package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsAddImageResponse extends ZenoResponse {

    private boolean success;
    private int added;

    public boolean isSuccess() {
        return success;
    }

    public int getAdded() {
        return added;
    }

}
