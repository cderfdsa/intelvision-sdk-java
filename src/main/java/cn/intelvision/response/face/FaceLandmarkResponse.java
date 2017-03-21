package cn.intelvision.response.face;

import cn.intelvision.model.Image;
import cn.intelvision.model.Point;
import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import cn.intelvision.model.Face;

import java.util.List;

/**
 * @author lan
 * @since 2016-03-15
 */
public class FaceLandmarkResponse extends ZenoResponse {

    private String detectionId;
    private Face face;
    private Image image;
    private List<Point> points;

    @JsonProperty("detection_id")
    public String getDetectionId() {
        return detectionId;
    }

    @JsonProperty("face")
    public Face getFace() {
        return face;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("points")
    public List<Point> getPoints() {
        return points;
    }

}
