package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.PersonCreateResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonCreateRequest extends ZenoRequest<PersonCreateResponse> {

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

    @Param(name = "birthday")
    private String birthday;

    @Param(name = "remark")
    private String remark;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getApi() {
        return "/v2/person/create";
    }
}
