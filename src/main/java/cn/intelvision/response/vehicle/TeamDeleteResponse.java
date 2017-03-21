package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamDeleteResponse extends ZenoResponse {

    private boolean success;
    private int deleted;

    public boolean isSuccess() {
        return success;
    }

    public int getDeleted() {
        return deleted;
    }

}
