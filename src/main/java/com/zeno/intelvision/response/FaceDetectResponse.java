package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectResponse extends ZenoResponse {

    private String detectionId;
    private String imageId;
    private String imageWidth;
    private String imageHeight;
    private String tag;
    private String url;
    private List<Face> faces;

    @JsonProperty("detection_id")
    public String getDetectionId() {
        return detectionId;
    }

    public void setDetectionId(String detectionId) {
        this.detectionId = detectionId;
    }

    @JsonProperty("image_id")
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("img_width")
    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    @JsonProperty("img_height")
    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("faces")
    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }
}
