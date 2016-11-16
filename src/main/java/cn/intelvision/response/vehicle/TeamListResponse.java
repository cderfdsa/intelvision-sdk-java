package cn.intelvision.response.vehicle;

import cn.intelvision.model.Team;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamListResponse extends ZenoResponse {

    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
