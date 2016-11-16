package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.ImageFacesResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class ImageFacesRequest extends ZenoRequest<ImageFacesResponse> {

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
        return "/v2/image/faces";
    }
}
