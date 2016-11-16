package cn.intelvision.request;

import cn.intelvision.response.InfoGetPersonListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetPersonListRequest extends ZenoRequest<InfoGetPersonListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_person_list";
    }
}
