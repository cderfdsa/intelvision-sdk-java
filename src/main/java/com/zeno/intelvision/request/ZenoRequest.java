package com.zeno.intelvision.request;

import com.zeno.intelvision.response.ZenoResponse;

/**
 * @author lan
 * @since 2016-03-14
 */
public abstract class ZenoRequest<T extends ZenoResponse> {

    public abstract String getApi();

}
