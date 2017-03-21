package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamCreateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamCreateRequest extends ZenoRequest<TeamCreateResponse> {

    @Param(name = "team_name")
    private String teamName;

    @Param(name = "tag")
    private String tag;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/vehicle/team/create";
    }
}
