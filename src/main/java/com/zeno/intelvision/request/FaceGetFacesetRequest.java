package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FaceGetFacesetResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetFacesetRequest extends ZenoRequest<FaceGetFacesetResponse> {

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
        return "/v2/face/get_facesets";
    }
}
