package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FacesetDeleteFaceResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetDeleteFaceRequest extends ZenoRequest<FacesetDeleteFaceResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "faceset_id")
    private String facesetId;

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/delete_face";
    }
}
