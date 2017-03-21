package cn.intelvision.response.vqds;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsDetectResponse extends ZenoResponse {

    private int shift;
    private int blur;
    private String colorCast;

    public int getShift() {
        return shift;
    }

    public int getBlur() {
        return blur;
    }

    @JsonProperty("color_cast")
    public String getColorCast() {
        return colorCast;
    }

}
