package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Search;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectSearchResponse extends ZenoResponse {

    private Search recognition;

    public Search getRecognition() {
        return recognition;
    }

    public void setRecognition(Search recognition) {
        this.recognition = recognition;
    }
}
