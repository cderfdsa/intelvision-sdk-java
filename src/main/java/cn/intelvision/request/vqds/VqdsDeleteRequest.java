package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsDeleteRequest extends ZenoRequest<VqdsDeleteResponse> {

    @Param(name = "vqds_ids")
    private String vqdsIds;

    @Param(name = "names")
    private String names;

    public void setVqdsIds(String vqdsIds) {
        this.vqdsIds = vqdsIds;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String getApi() {
        return "/vqds/delete";
    }
}
