package com.zeno.intelvision;

import com.zeno.intelvision.annotation.BinFile;
import com.zeno.intelvision.annotation.Param;
import com.zeno.intelvision.http.HttpService;
import com.zeno.intelvision.http.JsonMapper;
import com.zeno.intelvision.request.ZenoRequest;
import com.zeno.intelvision.response.ZenoResponse;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lan
 * @since 2016-03-14
 */
public class DefaultZenoClient implements ZenoClient {

    private String apiKey;
    private String apiSecret;
    private String serviceUrl;

    public DefaultZenoClient(String apiKey, String apiSecret, String serviceUrl) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.serviceUrl = serviceUrl;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends ZenoResponse> T execute(ZenoRequest<T> request) {
        Class<? extends ZenoRequest> clazz = request.getClass();
        Type t = clazz.getGenericSuperclass();
        Class<T> responseClass = null;
        if (t instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
            responseClass = (Class<T>) p[0];
        }
        Field[] fields = clazz.getDeclaredFields();
        Map<String, File> files = new HashMap<String, File>();
        Map<String, String> params = new HashMap<String, String>();
        if (apiKey != null && !"".equals(apiKey) && apiSecret != null && !"".equals(apiSecret)) {
            params.put("api_key", apiKey);
            params.put("api_secret", apiSecret);
        }
        for (Field field : fields) {
            field.setAccessible(true);
            BinFile binFile = field.getAnnotation(BinFile.class);
            if (binFile != null) {
                try {
                    files.put(binFile.name(), (File) field.get(request));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        if (!files.isEmpty()) {
            addParams(fields, params, request);
            if (!params.isEmpty()) {
                return JsonMapper.readValue(HttpService.getHttpService().postRequest(serviceUrl
                        + request.getApi(), params, files), responseClass);
            }
        } else {
            addParams(fields, params, request);
            if (!params.isEmpty()) {
                return JsonMapper.readValue(HttpService.getHttpService().getRequest(serviceUrl
                        + request.getApi(), params), responseClass);
            }
        }
        return null;
    }

    private <T extends ZenoResponse> Map<String, String> addParams(Field[] fields, Map<String,
            String> params, ZenoRequest<T> request) {
        for (Field field : fields) {
            field.setAccessible(true);
            Param param = field.getAnnotation(Param.class);
            if (param != null) {
                try {
                    Object o = field.get(request);
                    if (o != null) {
                        params.put(param.name(), o.toString());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return params;
    }
}
