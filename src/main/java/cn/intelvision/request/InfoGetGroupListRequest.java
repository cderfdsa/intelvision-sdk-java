package cn.intelvision.request;

import cn.intelvision.response.InfoGetGroupListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetGroupListRequest extends ZenoRequest<InfoGetGroupListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_group_list";
    }
}
