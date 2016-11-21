package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FaceGetInfoResponse;
import cn.intelvision.annotation.Param;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetInfoRequest extends ZenoRequest<FaceGetInfoResponse> {

    @Param(name = "face_id")
    private String faceId;

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/face/get_info";
    }
}
