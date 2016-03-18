package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FacesetSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetSetInfoRequest extends ZenoRequest<FacesetSetInfoResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    @Param(name = "faceset_name")
    private String facesetName;

    @Param(name = "tag")
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public String getFacesetName() {
        return facesetName;
    }

    public void setFacesetName(String facesetName) {
        this.facesetName = facesetName;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/set_info";
    }
}
