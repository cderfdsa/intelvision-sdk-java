package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FacesetCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetCreateRequest extends ZenoRequest<FacesetCreateResponse>{

    @Param(name = "faceset_name")
    private String facesetName;

    @Param(name = "tag")
    private String tag;

    public String getFacesetName() {
        return facesetName;
    }

    public void setFacesetName(String facesetName) {
        this.facesetName = facesetName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/create";
    }
}
