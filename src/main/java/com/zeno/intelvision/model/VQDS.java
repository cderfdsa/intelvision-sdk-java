package com.zeno.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author lan
 * @since 2015-04-29
 */
public class VQDS {

    private String vqdsId;
    private String vqdsName;
    private String vqdsTag;
    private List<Image> images;

    @JsonProperty("vqds_id")
    public String getVqdsId() {
        return vqdsId;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    @JsonProperty("vqds_name")
    public String getVqdsName() {
        return vqdsName;
    }

    public void setVqdsName(String vqdsName) {
        this.vqdsName = vqdsName;
    }

    @JsonProperty("vqds_tag")
    public String getVqdsTag() {
        return vqdsTag;
    }

    public void setVqdsTag(String vqdsTag) {
        this.vqdsTag = vqdsTag;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
