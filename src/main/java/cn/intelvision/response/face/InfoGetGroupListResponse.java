package cn.intelvision.response.face;

import cn.intelvision.model.Group;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class InfoGetGroupListResponse extends ZenoResponse {

    public List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

}
