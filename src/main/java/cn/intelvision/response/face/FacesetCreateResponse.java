package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetCreateResponse extends ZenoResponse {

    private boolean success;
    private String facesetId;

    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("faceset_id")
    public String getFacesetId() {
        return facesetId;
    }

}
