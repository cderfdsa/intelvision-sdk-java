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

    @Override
    public String getApi() {
        return "/v2/recognition/detect_search";
    }

    public String getFacesetId() {
        return facesetId;
    }

    public void setFacesetId(String facesetId) {
        this.facesetId = facesetId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void setImg(InputStream is) {
        this.is = is;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
