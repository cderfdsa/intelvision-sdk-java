package cn.intelvision.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lan
 * @since 2016-03-14
 */
public abstract class ZenoResponse {

    private String errorCode;
    private String errorMsg;
    private String subErrorCode;
    private String subErrorMsg;

    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("error_msg")
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @JsonProperty("sub_error_code")
    public String getSubErrorCode() {
        return subErrorCode;
    }

    public void setSubErrorCode(String subErrorCode) {
        this.subErrorCode = subErrorCode;
    }

    @JsonProperty("sub_error_msg")
    public String getSubErrorMsg() {
        return subErrorMsg;
    }

    public void setSubErrorMsg(String subErrorMsg) {
        this.subErrorMsg = subErrorMsg;
    }
}
