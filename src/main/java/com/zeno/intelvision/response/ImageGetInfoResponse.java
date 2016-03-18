package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Image;

/**
 * Created by pc on 2016/3/15.
 */
public class ImageGetInfoResponse extends ZenoResponse{
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
