package cn.intelvision.request.face;

import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.FaceDetectResponse;

import java.io.File;

/**
 * @author lan
 * @since 2016-03-14
 */
public class FaceDetectRequest extends ZenoRequest<FaceDetectResponse> {

    @BinFile(name = "img")
    private File img;

    @Param(name = "url")
    private String url;

    @Param(name = "tag")
    private String tag;

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/detection/detect";
    }
}
