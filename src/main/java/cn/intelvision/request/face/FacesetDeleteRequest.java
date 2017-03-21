package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FacesetDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetDeleteRequest extends ZenoRequest<FacesetDeleteResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/delete";
    }
}
