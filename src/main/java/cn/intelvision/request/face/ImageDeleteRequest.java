package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.ImageDeleteResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageDeleteRequest extends ZenoRequest<ImageDeleteResponse> {

    @Param(name = "image_id")
    private String imageId;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String getApi() {
        return "/v2/image/delete";
    }
}
