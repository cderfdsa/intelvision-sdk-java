package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.TrainVerifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainVerifyRequest extends ZenoRequest<TrainVerifyResponse> {

    @Param(name = "person_id")
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/train/verify";
    }
}
