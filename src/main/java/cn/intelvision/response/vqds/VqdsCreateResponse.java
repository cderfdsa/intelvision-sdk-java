package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsCreateResponse extends ZenoResponse {

    private String vqdsId;
    private String tag;
    private String name;
    private Integer addedImages;

    @JsonProperty("vqds_id")
    public String getVqdsId() {
        return vqdsId;
    }

    @JsonProperty("added_images")
    public Integer getAddedImages() {
        return addedImages;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

}
