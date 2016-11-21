package cn.intelvision.request.face;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.InfoGetAppResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetAppRequest extends ZenoRequest<InfoGetAppResponse> {
    @Override
    public String getApi() {
        return "/face/info/get_app";
    }
}
