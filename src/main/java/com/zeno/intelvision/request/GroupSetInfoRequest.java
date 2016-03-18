package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.GroupSetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupSetInfoRequest extends ZenoRequest<GroupSetInfoResponse> {
    @Param(name = "group_id")
    private String groupId;

    @Param(name = "group_name")
    private String groupName;

    @Param(name = "tag")
    private String tag;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String getApi() {
        return "/v2/group/set_info";
    }
}
