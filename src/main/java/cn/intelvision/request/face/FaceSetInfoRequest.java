package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FaceSetInfoResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceSetInfoRequest extends ZenoRequest<FaceSetInfoResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "tag")
    private String tag;

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/face/set_info";
    }
}
