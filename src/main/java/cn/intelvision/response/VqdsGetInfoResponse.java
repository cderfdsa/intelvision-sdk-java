package cn.intelvision.response;

import cn.intelvision.model.Image;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsGetInfoResponse extends ZenoResponse {
    private String name;
    private String tag;
    private List<Image> images;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
