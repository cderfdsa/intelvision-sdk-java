package cn.intelvision.response;

import cn.intelvision.model.Image;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageSetInfoResponse extends ZenoResponse {
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
