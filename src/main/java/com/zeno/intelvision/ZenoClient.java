package com.zeno.intelvision;

import com.zeno.intelvision.request.ZenoRequest;
import com.zeno.intelvision.response.ZenoResponse;

/**
 * @author lan
 * @since 2016-03-14
 */
public interface ZenoClient {

    <T extends ZenoResponse> T execute(ZenoRequest<T> request);
}
