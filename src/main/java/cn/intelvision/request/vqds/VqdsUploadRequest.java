package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Stream;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsUploadResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsUploadRequest extends ZenoRequest<VqdsUploadResponse> {

    @Param(name = "url")
    private String url;

    @BinFile(name = "img")
    private File img;

    @Stream(name = "img")
    private InputStream is;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void setImg(InputStream img) {
        this.is = img;
    }

    @Override
    public String getApi() {
        return "/vqds/upload";
    }
}
