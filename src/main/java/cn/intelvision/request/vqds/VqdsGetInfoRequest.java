package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsGetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsGetInfoRequest extends ZenoRequest<VqdsGetInfoResponse> {

    @Param(name = "name")
    private String vqdsName;

    @Param(name = "vqds_id")
    private String vqdsId;

    public String getVqdsName() {
        return vqdsName;
    }

    public void setVqdsName(String vqdsName) {
        this.vqdsName = vqdsName;
    }

    public String getVqdsId() {
        return vqdsId;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    @Override
    public String getApi() {
        return "/vqds/get_info";
    }
}
