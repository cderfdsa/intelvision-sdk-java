package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.GroupAddPersonResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupAddPersonRequest extends ZenoRequest<GroupAddPersonResponse> {

    @Param(name = "group_id")
    private String groupId;

    @Param(name = "person_id")
    private String personId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/group/add_person";
    }
}
