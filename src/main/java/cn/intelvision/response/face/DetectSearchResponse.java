package cn.intelvision.response.face;

import cn.intelvision.model.Search;
import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/8/10.
 */
public class DetectSearchResponse extends ZenoResponse {

    private Search recognition;

    public Search getRecognition() {
        return recognition;
    }

}
