package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsDetectResponse extends ZenoResponse {
    private Integer shift;
    private Integer blur;
    private String colorCast;

    public Integer getShift() {
        return shift;
    }

    public void setShift(Integer shift) {
        this.shift = shift;
    }

    public Integer getBlur() {
        return blur;
    }

    public void setBlur(Integer blur) {
        this.blur = blur;
    }

    @JsonProperty("color_cast")
    public String getColorCast() {
        return colorCast;
    }

    public void setColorCast(String colorCast) {
        this.colorCast = colorCast;
    }
}
