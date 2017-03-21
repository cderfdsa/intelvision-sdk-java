package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.ImageFacesResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class ImageFacesRequest extends ZenoRequest<ImageFacesResponse> {

    @Param(name = "image_id")
    private String imageId;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String getApi() {
        return "/v2/image/faces";
    }
}
