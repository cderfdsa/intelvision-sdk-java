package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.RecognitionVerifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionVerifyRequest extends ZenoRequest<RecognitionVerifyResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "person_id")
    private String personId;

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/verify";
    }
}
