package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FacesetAddFaceResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetAddFaceRequest extends ZenoRequest<FacesetAddFaceResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    @Param(name = "face_id")
    private String faceId;

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/add_face";
    }
}
