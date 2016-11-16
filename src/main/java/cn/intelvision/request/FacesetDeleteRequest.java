package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.FacesetDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetDeleteRequest extends ZenoRequest<FacesetDeleteResponse> {

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
        return "/v2/faceset/delete";
    }
}
