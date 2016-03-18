package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Compare;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionCompareResponse extends ZenoResponse {
    private Compare recognition;

    public Compare getRecognition() {
        return recognition;
    }

    public void setRecognition(Compare recognition) {
        this.recognition = recognition;
    }
}
