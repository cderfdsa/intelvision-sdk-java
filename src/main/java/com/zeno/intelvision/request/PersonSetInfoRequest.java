package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.PersonSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonSetInfoRequest extends ZenoRequest<PersonSetInfoResponse> {

    @Param(name = "person_id")
    private String personId;

    @Param(name = "person_name")
    private String personName;

    @Param(name = "age")
    private Integer age;

    @Param(name = "race")
    private Integer race;

    @Param(name = "gender")
    private Integer gender;

    @Param(name = "tag")
    private String tag;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/person/set_info";
    }
}
