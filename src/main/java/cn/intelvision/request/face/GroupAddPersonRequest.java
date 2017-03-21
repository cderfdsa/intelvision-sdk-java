package cn.intelvision.request.face;

import cn.intelvision.annotation.Param;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.face.GroupAddPersonResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupAddPersonRequest extends ZenoRequest<GroupAddPersonResponse> {

    @Param(name = "group_id")
    private String groupId;

    @Param(name = "person_id")
    private String personId;

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String getApi() {
        return "/v2/group/add_person";
    }
}
