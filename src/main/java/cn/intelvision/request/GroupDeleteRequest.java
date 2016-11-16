package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.GroupDeleteResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupDeleteRequest extends ZenoRequest<GroupDeleteResponse> {

    @Param(name = "group_id")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String getApi() {
        return "/v2/group/delete";
    }
}
