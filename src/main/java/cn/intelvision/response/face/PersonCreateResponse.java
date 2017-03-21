package cn.intelvision.response.face;

import cn.intelvision.response.ZenoResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pc on 2016/3/16.
 */
public class PersonCreateResponse extends ZenoResponse {

    private boolean success;
    private String personId;

    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("person_id")
    public String getPersonId() {
        return personId;
    }

}
