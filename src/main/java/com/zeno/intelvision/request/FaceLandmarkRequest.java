package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FaceLandmarkResponse;

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
