package cn.intelvision.response;

import cn.intelvision.model.Search;

/**
 * Created by pc on 2016/3/15.
 */
public class RecognitionSearchResponse extends ZenoResponse {
    private Search recognition;

    public Search getRecognition() {
        return recognition;
    }

    public void setRecognition(Search recognition) {
        this.recognition = recognition;
    }
}
