package cn.intelvision;

import cn.intelvision.model.Team;
import cn.intelvision.model.Vehicle;
import cn.intelvision.request.vehicle.*;
import cn.intelvision.response.vehicle.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.List;

/**
 * @author lanhuidong
 * @since 2016-11-16
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeamTest extends BaseTest {

    private static String teamId;
    private static String vehicleId;
    private static final String TEAM_NAME = "F1车队";
    private static final String NEW_TEAM_NAME = "Zeno";
    private static final String TAG = "Java SDK测试";

    @BeforeClass
    public static void beforeClass() {
        BaseTest.beforeClass();
        VehicleCreateRequest request = new VehicleCreateRequest();
        request.setVehicleName("Benz");
        request.setTag(TAG);
        request.setVehicleColor("RED");
        VehicleCreateResponse response = zenoClient.execute(request);
        vehicleId = response.getVehicleId();
    }

    @AfterClass
    public static void afterClass() {
        VehicleDeleteRequest request = new VehicleDeleteRequest();
        request.setVehicleId(vehicleId);
        VehicleDeleteResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void test1Create() {
        TeamCreateRequest request = new TeamCreateRequest();
        request.setTeamName(TEAM_NAME);
        request.setTag(TAG);
        TeamCreateResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(16, response.getTeamId().length());
        teamId = response.getTeamId();
    }

    @Test
    public void test2GetInfo() {
        TeamGetInfoRequest request = new TeamGetInfoRequest();
        request.setTeamId(teamId);
        TeamGetInfoResponse response = zenoClient.execute(request);
        Team team = response.getTeam();
        Assert.assertNotNull(team);
        Assert.assertEquals(TEAM_NAME, team.getTeamName());
        Assert.assertEquals(TAG, team.getTag());
        Assert.assertTrue(team.getAddTime() > 0);
        Assert.assertEquals(16, team.getAppId().length());
    }

    @Test
    public void test3SetInfo() {
        TeamSetInfoRequest request = new TeamSetInfoRequest();
        request.setTeamId(teamId);
        request.setTeamName(NEW_TEAM_NAME);
        TeamSetInfoResponse response = zenoClient.execute(request);
        Team team = response.getTeam();
        Assert.assertNotNull(team);
        Assert.assertEquals(NEW_TEAM_NAME, team.getTeamName());
    }

    @Test
    public void test4AddVechile() {
        TeamAddVehicleRequest request = new TeamAddVehicleRequest();
        request.setTeamId(teamId);
        request.setVehicleId(vehicleId);
        TeamAddVehicleResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getAdded());
    }

    @Test
    public void test5Vehicles() {
        TeamVehiclesRequest request = new TeamVehiclesRequest();
        request.setTeamId(teamId);
        TeamVehiclesResponse response = zenoClient.execute(request);
        Assert.assertEquals(1, response.getVehicles().size());
        Vehicle vehicle = response.getVehicles().get(0);
        Assert.assertNotNull(vehicle.getVehicleName());
    }

    @Test
    public void test6DeleteVechile() {
        TeamDeleteVehicleRequest request = new TeamDeleteVehicleRequest();
        request.setTeamId(teamId);
        request.setVehicleId(vehicleId);
        TeamDeleteVehicleResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }

    @Test
    public void test7List() {
        TeamListRequest request = new TeamListRequest();
        TeamListResponse response = zenoClient.execute(request);
        List<Team> teams = response.getTeams();
        Assert.assertEquals(1, teams.size());
        Team team = teams.get(0);
        Assert.assertEquals(teamId, team.getTeamId());
        Assert.assertEquals(NEW_TEAM_NAME, team.getTeamName());
        Assert.assertEquals(TAG, team.getTag());
        Assert.assertEquals(16, team.getAppId().length());
        Assert.assertTrue(team.getAddTime() > 0);
    }

    @Test
    public void test8Delete() {
        TeamDeleteRequest request = new TeamDeleteRequest();
        request.setTeamId(teamId);
        TeamDeleteResponse response = zenoClient.execute(request);
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals(1, response.getDeleted());
    }
}
