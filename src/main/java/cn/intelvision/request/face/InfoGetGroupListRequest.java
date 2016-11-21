package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.InfoGetGroupListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetGroupListRequest extends ZenoRequest<InfoGetGroupListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_group_list";
    }
}
