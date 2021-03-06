package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.PersonGroupsResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonGroupsRequest extends ZenoRequest<PersonGroupsResponse> {

    @Param(name = "person_id")
    private String personId;

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/person/groups";
    }
}
