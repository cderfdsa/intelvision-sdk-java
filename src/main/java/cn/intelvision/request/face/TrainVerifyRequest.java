package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.TrainVerifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainVerifyRequest extends ZenoRequest<TrainVerifyResponse> {

    @Param(name = "person_id")
    private String personId;

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/train/verify";
    }
}
