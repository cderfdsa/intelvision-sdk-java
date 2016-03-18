package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author lan
 * @since 2015-01-21
 */
public class Faceset {

    private String facesetName;
    private String facesetId;
    private String tag;
    private String appId;
    private Date addTime;
    private String ufaceId;

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

    @JsonProperty("app_id")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("add_time")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getUfaceId() {
        return ufaceId;
    }

    public void setUfaceId(String ufaceId) {
        this.ufaceId = ufaceId;
    }
}
