package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsUploadResponse extends ZenoResponse {

    private String imageId;
    private String url;
    private Integer width;
    private Integer height;

    @JsonProperty("image_id")
    public String getImageId() {
        return imageId;
    }

    public String getUrl() {
        return url;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

}
