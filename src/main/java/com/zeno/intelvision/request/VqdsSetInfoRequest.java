package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.VqdsSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsSetInfoRequest extends ZenoRequest<VqdsSetInfoResponse> {

    @Param(name = "vqds_name")
    private String vqdsName;

    @Param(name = "vqds_id")
    private String vqdsId;

    @Param(name = "name")
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
