package cn.intelvision.response;

import cn.intelvision.model.Verify;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionVerifyResponse extends ZenoResponse {
    private Verify recognition;

    public Verify getRecognition() {
        return recognition;
    }

    public void setRecognition(Verify recognition) {
        this.recognition = recognition;
    }
}
