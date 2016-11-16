package cn.intelvision;

import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.ZenoResponse;

/**
 * @author lan
 * @since 2016-03-14
 */
public interface ZenoClient {

    <T extends ZenoResponse> T execute(ZenoRequest<T> request);
}
