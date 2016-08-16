package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Verify;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectVerifyResponse extends ZenoResponse {

    private Verify recognition;

    public Verify getRecognition() {
        return recognition;
    }

    public void setRecognition(Verify recognition) {
        this.recognition = recognition;
    }
}
