package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Faceset;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetFacesetListResponse extends ZenoResponse {
    private List<Faceset> facesets;

    public List<Faceset> getFacesets() {
        return facesets;
    }

    public void setFacesets(List<Faceset> facesets) {
        this.facesets = facesets;
    }
}
