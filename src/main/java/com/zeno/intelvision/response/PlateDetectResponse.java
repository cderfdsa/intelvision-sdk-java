package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zeno.intelvision.model.Plate;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateDetectResponse extends ZenoResponse {
    private String plateId;
    private String url;
    private Integer imgWidth;
    private Integer imgHeight;
    private String color;
    private String logo;
    private List<Plate> plate;

    @JsonProperty("plate_id")
    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("img_width")
    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    @JsonProperty("img_height")
    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Plate> getPlate() {
        return plate;
    }

    public void setPlate(List<Plate> plate) {
        this.plate = plate;
    }
}
