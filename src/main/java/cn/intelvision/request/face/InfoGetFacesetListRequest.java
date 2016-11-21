package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.InfoGetFacesetListResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetFacesetListRequest extends ZenoRequest<InfoGetFacesetListResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_faceset_list";
    }
}
