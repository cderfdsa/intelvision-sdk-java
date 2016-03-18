package com.zeno.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsCreateResponse extends ZenoResponse {
    private String vqdsId;
    private String tag;
    private String name;
    private Integer addedImages;

    @JsonProperty("vqds_id")
    public String getVqdsId() {
        return vqdsId;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    @JsonProperty("added_images")
    public Integer getAddedImages() {
        return addedImages;
    }

    public void setAddedImages(Integer addedImages) {
        this.addedImages = addedImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
