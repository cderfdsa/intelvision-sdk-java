package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.ImageSetInfoResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageSetInfoRequest extends ZenoRequest<ImageSetInfoResponse> {

    @Param(name = "image_id")
    private String imageId;

    @Param(name = "tag")
    private String tag;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/image/set_info";
    }
}
