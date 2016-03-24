package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VqdsRemoveImageResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsRemoveImageRequest extends ZenoRequest<VqdsRemoveImageResponse> {

    @Param(name = "name")
    private String vqdsName;

    @Param(name = "vqds_id")
    private String vqdsId;

    @Param(name = "image_ids")
    private String imageIds;

    public String getVqdsName() {
        return vqdsName;
    }

    public void setVqdsName(String vqdsName) {
        this.vqdsName = vqdsName;
    }

    public String getVqdsId() {
        return vqdsId;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    public String getImageIds() {
        return imageIds;
    }

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    @Override
    public String getApi() {
        return "/vqds/remove_image";
    }
}
