package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FaceGetImageResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetImageRequest extends ZenoRequest<FaceGetImageResponse> {

    @Param(name = "face_id")
    private String faceId;

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/face/get_image";
    }
}
