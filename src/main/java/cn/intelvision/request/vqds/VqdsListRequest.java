package cn.intelvision.request.vqds;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsListRequest extends ZenoRequest<VqdsListResponse> {
    @Override
    public String getApi() {
        return "/vqds/list";
    }
}
