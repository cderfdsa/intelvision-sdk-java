package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamSetInfoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamSetInfoRequest extends ZenoRequest<TeamSetInfoResponse> {

    @Param(name = "team_id")
    private String teamId;

    @Param(name = "team_name")
    private String teamName;

    @Param(name = "tag")
    private String tag;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/vehicle/team/set_info";
    }
}
