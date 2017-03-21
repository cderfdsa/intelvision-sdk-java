package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FacesetAddFaceResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetAddFaceRequest extends ZenoRequest<FacesetAddFaceResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    @Param(name = "face_id")
    private String faceId;

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/add_face";
    }
}
