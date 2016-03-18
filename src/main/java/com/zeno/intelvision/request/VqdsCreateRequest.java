package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VqdsCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsCreateRequest extends ZenoRequest<VqdsCreateResponse> {

    @Param(name = "name")
    private String name;

    @Param(name = "tag")
    private String tag;

    @Param(name = "image_ids")
    private String imageIds;

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

    public String getImageIds() {
        return imageIds;
    }

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public String getApi() {
        return "/vqds/create";
    }
}
