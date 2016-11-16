package cn.intelvision.request.vehicle;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vehicle.PlatesetListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PlatesetListRequest extends ZenoRequest<PlatesetListResponse> {

    @Override
    public String getApi() {
        return "/plate/plateset_list";
    }
}
