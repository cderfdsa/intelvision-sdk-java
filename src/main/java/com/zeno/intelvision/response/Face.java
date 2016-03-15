package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lan
 * @since 2016-03-15
 */
public class Face {

    private String faceId;
    private String imageId;
    private Integer positionX;
    private Integer positionY;
    private Integer positionW;
    private Integer positionH;
    private Long addTime;
    private String appId;

    @JsonProperty("face_id")
    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @JsonProperty("image_id")
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @JsonProperty("position_x")
    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    @JsonProperty("position_y")
    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    @JsonProperty("position_w")
    public Integer getPositionW() {
        return positionW;
    }

    public void setPositionW(Integer positionW) {
        this.positionW = positionW;
    }

    @JsonProperty("position_h")
    public Integer getPositionH() {
        return positionH;
    }

    public void setPositionH(Integer positionH) {
        this.positionH = positionH;
    }

    @JsonProperty("add_time")
    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    @JsonProperty("app_id")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
