package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsDetectResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsDetectRequest extends ZenoRequest<VqdsDetectResponse> {

    @Param(name = "image_ids")
    private String imageIds;

    @Param(name = "ref_image_ids")
    private String refImageIds;

    @Param(name = "x")
    private Integer x;

    @Param(name = "y")
    private Integer y;

    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    public void setRefImageIds(String refImageIds) {
        this.refImageIds = refImageIds;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String getApi() {
        return "/vqds/detect";
    }
}
