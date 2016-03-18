package com.zeno.intelvision.request;

import com.zeno.intelvision.response.InfoGetFacesetListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetFacesetListRequest extends ZenoRequest<InfoGetFacesetListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_faceset_list";
    }
}
