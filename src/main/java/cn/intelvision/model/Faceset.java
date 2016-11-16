package cn.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lan
 * @since 2015-01-21
 */
public class Faceset {

    private String facesetName;
    private String facesetId;
    private String tag;
    private Long addTime;
    private String appId;

    @JsonProperty("faceset_name")
    public String getFacesetName() {
        return facesetName;
    }

    public void setFacesetName(String facesetName) {
        this.facesetName = facesetName;
    }

    @JsonProperty("faceset_id")
    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
