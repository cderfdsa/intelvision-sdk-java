package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FaceGetPersonResponse;
import cn.intelvision.annotation.Param;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetPersonRequest extends ZenoRequest<FaceGetPersonResponse> {

    @Param(name = "face_id")
    private String faceId;

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/face/get_person";
    }
}
