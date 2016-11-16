package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.RecognitionVerifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionVerifyRequest extends ZenoRequest<RecognitionVerifyResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "person_id")
    private String personId;

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/verify";
    }
}
