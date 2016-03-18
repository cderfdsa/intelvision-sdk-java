package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Group;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupGetInfoResponse extends ZenoResponse {
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
