package cn.intelvision.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class Vehicle {

    private String vehicleId;

    private String vehicleName;

    private String vehicleColor;

    private String vehicleModel;

    private String purchaseDate;

    private String tag;

    private String plaNumber;

    private long addTime;

    @JsonProperty("vehicle_id")
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @JsonProperty("vehicle_name")
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @JsonProperty("vehicle_color")
    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    @JsonProperty("vehicle_model")
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @JsonProperty("purchase_date")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("pla_number")
    public String getPlaNumber() {
        return plaNumber;
    }

    public void setPlaNumber(String plaNumber) {
        this.plaNumber = plaNumber;
    }

    @JsonProperty("add_time")
    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }
}
