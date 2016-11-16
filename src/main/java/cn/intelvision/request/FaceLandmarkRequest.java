package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.FaceLandmarkResponse;

/**
 * @author lan
 * @since 2016-03-15
 */
public class FaceLandmarkRequest extends ZenoRequest<FaceLandmarkResponse> {

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
        return "/v2/detection/landmark";
    }
}
