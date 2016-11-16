package cn.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ma on 2016/2/17.
 */
public class Plateset {

    private String platesetId;
    private String platesetName;
    private String tag;
    private Long addTime;
    private String appId;

    @JsonProperty("plateset_name")
    public String getPlatesetName() {
        return platesetName;
    }

    public void setPlatesetName(String platesetName) {
        this.platesetName = platesetName;
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

    @JsonProperty("plateset_id")
    public String getPlatesetId() {
        return platesetId;
    }

    public void setPlatesetId(String platesetId) {
        this.platesetId = platesetId;
    }

    @JsonProperty("app_id")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
