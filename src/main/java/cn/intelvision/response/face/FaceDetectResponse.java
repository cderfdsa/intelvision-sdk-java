package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.intelvision.model.Face;

import java.util.List;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectResponse extends ZenoResponse {

    private String detectionId;
    private String imageId;
    private Integer imageWidth;
    private Integer imageHeight;
    private String tag;
    private String url;
    private List<Face> faces;

    @JsonProperty("detection_id")
    public String getDetectionId() {
        return detectionId;
    }

    @JsonProperty("image_id")
    public String getImageId() {
        return imageId;
    }

    @JsonProperty("img_width")
    public Integer getImageWidth() {
        return imageWidth;
    }

    @JsonProperty("img_height")
    public Integer getImageHeight() {
        return imageHeight;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("faces")
    public List<Face> getFaces() {
        return faces;
    }

}
