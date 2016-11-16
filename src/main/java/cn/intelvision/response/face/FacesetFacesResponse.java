package cn.intelvision.response.face;

import cn.intelvision.model.Face;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class FacesetFacesResponse extends ZenoResponse {
    private List<Face> faces;

    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }
}
