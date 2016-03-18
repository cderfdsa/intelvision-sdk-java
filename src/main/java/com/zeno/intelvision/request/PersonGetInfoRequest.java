package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PersonGetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonGetInfoRequest extends ZenoRequest<PersonGetInfoResponse> {

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
        return "/v2/person/get_info";
    }
}
