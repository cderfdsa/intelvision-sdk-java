package cn.intelvision.request.vehicle;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.TeamDeleteVehicleResponse;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
public class TeamDeleteVehicleRequest extends ZenoRequest<TeamDeleteVehicleResponse> {

    @Param(name = "team_id")
    private String teamId;

    @Param(name = "vehicle_id")
    private String vehicleId;

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String getApi() {
        return "/vehicle/team/delete_vehicle";
    }
}
