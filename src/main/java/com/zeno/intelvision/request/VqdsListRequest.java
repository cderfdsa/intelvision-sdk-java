package com.zeno.intelvision.request;

import com.zeno.intelvision.response.VqdsListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsListRequest extends ZenoRequest<VqdsListResponse>{
    @Override
    public String getApi() {
        return "/vqds/list";
    }
}
