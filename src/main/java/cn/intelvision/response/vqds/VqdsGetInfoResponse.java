package cn.intelvision.response.vqds;

import cn.intelvision.model.Image;
import cn.intelvision.response.ZenoResponse;

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

    public String getTag() {
        return tag;
    }

    public List<Image> getImages() {
        return images;
    }

}
