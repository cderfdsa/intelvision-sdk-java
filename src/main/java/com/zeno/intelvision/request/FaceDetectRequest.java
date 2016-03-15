package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.BinFile;
import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.FaceDetectResponse;

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

    @Param(name = "store")
    private Boolean store = true;

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

    public Boolean isStore() {
        return store;
    }

    public void setStore(Boolean store) {
        this.store = store;
    }

    @Override
    public String getApi() {
        return "/v2/detection/detect";
    }
}
