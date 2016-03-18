package com.zeno.intelvision.response;

import com.zeno.intelvision.model.Group;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetGroupListResponse extends ZenoResponse {
    public List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
