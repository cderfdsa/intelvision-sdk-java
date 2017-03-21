package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.Stream;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.DetectSearchResponse;
import cn.intelvision.annotation.BinFile;

import java.io.File;
import java.io.InputStream;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectSearchRequest extends ZenoRequest<DetectSearchResponse> {

    @Param(name = "faceset_id")
    private String facesetId;

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Stream(name = "img")
    private InputStream is;

    @Param(name = "count")
    private Integer count;

    @Param(name = "score")
    private Integer score;

    @Param(name = "x")
    private Integer x;

    @Param(name = "y")
    private Integer y;

    @Param(name = "width")
    private Integer width;

    @Param(name = "height")
    private Integer height;

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void setImg(InputStream img) {
        this.is = img;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String getApi() {
        return "/v2/recognition/detect_search";
    }

}
