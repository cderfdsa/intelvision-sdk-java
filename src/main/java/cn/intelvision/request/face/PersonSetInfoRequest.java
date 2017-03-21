package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.PersonSetInfoResponse;

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
    private String gender;

    @Param(name = "tag")
    private String tag;

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/person/set_info";
    }
}
