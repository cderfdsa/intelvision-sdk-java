package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.VehicleCreateResponse;

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

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPlaNmber(String plaNmber) {
        this.plaNmber = plaNmber;
    }

    @Override
    public String getApi() {
        return "/vehicle/create";
    }
}
