package com.zeno.intelvision.request;

import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.response.GroupGetInfoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupGetInfoRequest extends ZenoRequest<GroupGetInfoResponse> {

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
        return "/v2/group/get_info";
    }
}
