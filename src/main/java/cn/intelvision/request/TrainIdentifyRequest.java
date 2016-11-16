package cn.intelvision.request;

import cn.intelvision.annotation.Param;
import cn.intelvision.response.TrainIdentifyResponse;

/**
 * Created by pc on 2016/3/15.
 */
public class TrainIdentifyRequest extends ZenoRequest<TrainIdentifyResponse> {

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
        return "/v2/train/identify";
    }
}
