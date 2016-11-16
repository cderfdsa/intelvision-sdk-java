package cn.intelvision.response;

import cn.intelvision.model.Group;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonGroupsResponse extends ZenoResponse {

    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
