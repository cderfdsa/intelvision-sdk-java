package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.BinFile;
import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.DetectVerifyResponse;

import java.io.File;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectVerifyRequest extends ZenoRequest<DetectVerifyResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Param(name = "person_id")
    private String personId;

    @Param(name = "x")
    private Integer x;

    @Param(name = "y")
    private Integer y;

    @Param(name = "width")
    private Integer width;

    @Param(name = "height")
    private Integer height;

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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    @Override
    public String getApi() {
        return "/v2/recognition/detect_verify";
    }
}
