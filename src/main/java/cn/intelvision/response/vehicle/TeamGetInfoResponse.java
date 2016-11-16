package cn.intelvision.response.vehicle;

import cn.intelvision.model.Team;
import cn.intelvision.response.ZenoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamGetInfoResponse extends ZenoResponse {

    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
