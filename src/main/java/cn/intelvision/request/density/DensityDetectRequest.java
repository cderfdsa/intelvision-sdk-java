package cn.intelvision.request.density;

import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.Stream;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.density.DensityDetectResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by pc on 2016/3/16.
 */
public class DensityDetectRequest extends ZenoRequest<DensityDetectResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Stream(name = "img")
    private InputStream is;

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

    public void setImg(InputStream is) {
        this.is = is;
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
        return "/people/density/detect";
    }
}
