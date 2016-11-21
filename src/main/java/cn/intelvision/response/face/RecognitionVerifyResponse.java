package cn.intelvision.response.face;

import cn.intelvision.model.Verify;
import cn.intelvision.response.ZenoResponse;

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
