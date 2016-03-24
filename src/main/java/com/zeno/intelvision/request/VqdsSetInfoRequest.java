package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VqdsSetInfoResponse;

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

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/vqds/set_info";
    }
}
