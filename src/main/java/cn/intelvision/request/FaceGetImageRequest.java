package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.FaceGetImageResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetImageRequest extends ZenoRequest<FaceGetImageResponse> {

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
        return "/v2/face/get_image";
    }
}
