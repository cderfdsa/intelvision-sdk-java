package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.ImageGetInfoResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageGetInfoRequest extends ZenoRequest<ImageGetInfoResponse> {

    @Param(name = "image_id")
    private String imageId;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String getApi() {
        return "/v2/image/get_info";
    }
}
