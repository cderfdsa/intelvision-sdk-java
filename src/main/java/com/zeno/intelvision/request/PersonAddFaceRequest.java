package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PersonAddFaceResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonAddFaceRequest extends ZenoRequest<PersonAddFaceResponse> {

    @Param(name = "person_id")
    private String personId;

    @Param(name = "face_id")
    private String faceId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public String getApi() {
        return "/v2/person/add_face";
    }
}
