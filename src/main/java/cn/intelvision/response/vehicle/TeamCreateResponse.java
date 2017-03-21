package cn.intelvision.response.vehicle;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamCreateResponse extends ZenoResponse {

    private boolean success;
    private String teamId;

    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

}
