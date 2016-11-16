package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamGetInfoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamGetInfoRequest extends ZenoRequest<TeamGetInfoResponse> {

    @Param(name = "team_id")
    private String teamId;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    public String getApi() {
        return "/vehicle/team/get_info";
    }
}
