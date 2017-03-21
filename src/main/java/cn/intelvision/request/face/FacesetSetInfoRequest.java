package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FacesetSetInfoResponse;

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

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public void setFacesetName(String facesetName) {
        this.facesetName = facesetName;
    }

    @Override
    public String getApi() {
        return "/v2/faceset/set_info";
    }
}
