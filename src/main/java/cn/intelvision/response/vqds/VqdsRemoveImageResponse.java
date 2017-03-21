package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsRemoveImageResponse extends ZenoResponse {

    private boolean success;
    private int removed;

    public boolean isSuccess() {
        return success;
    }

    public int getRemoved() {
        return removed;
    }

}
