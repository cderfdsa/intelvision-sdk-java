package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Bytes;
import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.Stream;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlateDetectResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateDetectRequest extends ZenoRequest<PlateDetectResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Bytes(name = "img")
    private byte[] data;

    @Stream(name = "img")
    private InputStream is;

    @Param(name = "tag")
    private String tag;

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

    public void setTag(String tag) {
        this.tag = tag;
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
        return "/plate/detection/detect";
    }
}
