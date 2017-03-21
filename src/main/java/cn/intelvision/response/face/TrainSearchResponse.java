package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainSearchResponse extends ZenoResponse {

    private String sessionId;

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

}
