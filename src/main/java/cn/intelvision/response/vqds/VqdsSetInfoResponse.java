package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsSetInfoResponse extends ZenoResponse {

    private String vqdsId;
    private String name;
    private String tag;

    @JsonProperty("vqds_id")
    public String getVqdsId() {
        return vqdsId;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

}
