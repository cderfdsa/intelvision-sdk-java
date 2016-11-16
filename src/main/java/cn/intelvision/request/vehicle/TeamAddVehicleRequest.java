package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamAddVehicleResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamAddVehicleRequest extends ZenoRequest<TeamAddVehicleResponse> {

    @Param(name = "team_id")
    private String teamId;

    @Param(name = "vehicle_id")
    private String vehicleId;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String getApi() {
        return "/vehicle/team/add_vehicle";
    }
}
