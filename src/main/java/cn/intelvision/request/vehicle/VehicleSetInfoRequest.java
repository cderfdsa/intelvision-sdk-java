package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.VehicleSetInfoResponse;

/**
 * @author lanhuidong
 * @since 2016-11-15
 */
public class VehicleSetInfoRequest extends ZenoRequest<VehicleSetInfoResponse> {

    @Param(name = "vehicle_id")
    private String vehicleId;

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
    private String plaNumber;

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

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

    public void setPlaNumber(String plaNumber) {
        this.plaNumber = plaNumber;
    }

    @Override
    public String getApi() {
        return "/vehicle/set_info";
    }
}
