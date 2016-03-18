package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.BinFile;
import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VqdsUploadResponse;

import java.io.File;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsUploadRequest extends ZenoRequest<VqdsUploadResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

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

    @Override
    public String getApi() {
        return "/vqds/upload";
    }
}
