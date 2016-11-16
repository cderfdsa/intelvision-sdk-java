package cn.intelvision.request.vehicle;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamListResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamListRequest extends ZenoRequest<TeamListResponse> {

    @Override
    public String getApi() {
        return "/vehicle/team/list";
    }
}
