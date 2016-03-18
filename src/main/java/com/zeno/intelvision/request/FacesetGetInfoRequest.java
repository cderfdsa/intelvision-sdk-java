package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FacesetGetInfoResponse;


/**
 * Created by pc on 2016/3/16.
 */
public class FacesetGetInfoRequest extends ZenoRequest<FacesetGetInfoResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/get_info";
    }
}
