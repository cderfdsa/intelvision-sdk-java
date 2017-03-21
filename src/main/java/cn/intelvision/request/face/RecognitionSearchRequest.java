package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.RecognitionSearchResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionSearchRequest extends ZenoRequest<RecognitionSearchResponse> {

    @Param(name = "face_id")
    private String faceId;

    @Param(name = "faceset_id")
    private String facesetId;

    @Param(name = "count")
    private Integer count;

    @Param(name = "score")
    private Integer score;

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/search";
    }
}
