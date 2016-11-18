package cn.intelvision.response.face;

import cn.intelvision.model.Group;
import cn.intelvision.response.ZenoResponse;

/**
 * Created by pc on 2016/3/16.
 */
public class GroupSetInfoResponse extends ZenoResponse {
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
