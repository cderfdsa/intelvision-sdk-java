package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.TrainSearchResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainSearchRequest extends ZenoRequest<TrainSearchResponse> {

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
        return "/v2/train/search";
    }
}
