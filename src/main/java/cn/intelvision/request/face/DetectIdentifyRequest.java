package cn.intelvision.request.face;

import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Bytes;
import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.Stream;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.DetectIdentifyResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectIdentifyRequest extends ZenoRequest<DetectIdentifyResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Bytes(name = "img")
    private byte[] data;

    @Stream(name = "img")
    private InputStream is;

    @Param(name = "group_id")
    private String groupId;

    @Param(name = "x")
    private Integer x;

    @Param(name = "y")
    private Integer y;

    @Param(name = "width")
    private Integer width;

    @Param(name = "height")
    private Integer height;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void setImg(byte[] img) {
        this.data = img;
    }

    public void setImg(InputStream img) {
        this.is = img;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
        return "/v2/recognition/detect_identify";
    }
}
