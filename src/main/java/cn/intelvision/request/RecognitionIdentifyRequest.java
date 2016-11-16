package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.RecognitionIdentifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionIdentifyRequest extends ZenoRequest<RecognitionIdentifyResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "group_id")
    private String groupId;

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/identify";
    }
}
