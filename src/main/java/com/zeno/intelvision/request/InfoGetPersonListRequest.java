package com.zeno.intelvision.request;

import com.zeno.intelvision.response.InfoGetPersonListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetPersonListRequest extends ZenoRequest<InfoGetPersonListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_person_list";
    }
}
