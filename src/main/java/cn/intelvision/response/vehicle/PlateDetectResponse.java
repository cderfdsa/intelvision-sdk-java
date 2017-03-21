package cn.intelvision.response.vehicle;

import cn.intelvision.model.Plate;
import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PlateDetectResponse extends ZenoResponse {

    private String plateId;
    private String url;
    private Integer imgWidth;
    private Integer imgHeight;
    private String color;
    private String logo;
    private List<Plate> plate;

    @JsonProperty("plate_id")
    public String getPlateId() {
        return plateId;
    }

    public String getUrl() {
        return url;
    }

    @JsonProperty("img_width")
    public Integer getImgWidth() {
        return imgWidth;
    }

    @JsonProperty("img_height")
    public Integer getImgHeight() {
        return imgHeight;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public List<Plate> getPlate() {
        return plate;
    }

}
