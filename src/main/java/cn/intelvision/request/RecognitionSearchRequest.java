package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.RecognitionSearchResponse;

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/search";
    }
}
