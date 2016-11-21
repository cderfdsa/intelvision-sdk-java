package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.InfoGetPersonListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetPersonListRequest extends ZenoRequest<InfoGetPersonListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_person_list";
    }
}
