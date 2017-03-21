package cn.intelvision.request.vqds;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.vqds.VqdsSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsSetInfoRequest extends ZenoRequest<VqdsSetInfoResponse> {

    @Param(name = "name")
    private String vqdsName;

    @Param(name = "vqds_id")
    private String vqdsId;

    @Param(name = "new_name")
    private String newName;

    @Param(name = "tag")
    private String tag;

    public void setVqdsName(String vqdsName) {
        this.vqdsName = vqdsName;
    }

    public void setVqdsId(String vqdsId) {
        this.vqdsId = vqdsId;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/vqds/set_info";
    }
}
