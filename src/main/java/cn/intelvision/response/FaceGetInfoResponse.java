package cn.intelvision.response;

import cn.intelvision.model.Face;

/**
 * Created by pc on 2016/3/15.
 */
public class FaceGetInfoResponse extends ZenoResponse{
    private Face face;

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }
}
