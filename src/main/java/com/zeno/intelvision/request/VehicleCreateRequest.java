package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VehicleCreateResponse;

/**
 * @author lanhuidong
 * @since 2016-11-14
 */
public class VehicleCreateRequest extends ZenoRequest<VehicleCreateResponse> {

    @Param(name = "vehicle_name")
    private String vehicleName;

    @Param(name = "tag")
    private String tag;

    @Param(name = "vehicle_color")
    private String vehicleColor;

    @Param(name = "vehicle_model")
    private String vehicleModel;

    @Param(name = "purchase_date")
    private String purchaseDate;

    @Param(name = "pla_number")
    private String plaNmber;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPlaNmber() {
        return plaNmber;
    }

    public void setPlaNmber(String plaNmber) {
        this.plaNmber = plaNmber;
    }

    @Override
    public String getApi() {
        return "/vehicle/create";
    }
}
