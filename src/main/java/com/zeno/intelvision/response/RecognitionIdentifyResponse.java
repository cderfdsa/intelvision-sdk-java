package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Identify;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionIdentifyResponse extends ZenoResponse {
    private Identify recognition;

    public Identify getRecognition() {
        return recognition;
    }

    public void setRecognition(Identify recognition) {
        this.recognition = recognition;
    }
}
