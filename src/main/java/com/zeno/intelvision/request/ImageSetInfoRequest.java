package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.ImageSetInfoResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageSetInfoRequest extends ZenoRequest<ImageSetInfoResponse> {

    @Param(name = "image_id")
    private String imageId;

    @Param(name = "tag")
    private String tag;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/image/set_info";
    }
}
