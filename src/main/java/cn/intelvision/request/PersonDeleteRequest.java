package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.PersonDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonDeleteRequest extends ZenoRequest<PersonDeleteResponse> {

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
        return "/v2/person/delete";
    }
}
