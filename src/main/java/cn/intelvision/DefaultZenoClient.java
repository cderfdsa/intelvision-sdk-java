package cn.intelvision;

import cn.intelvision.annotation.BinFile;
import cn.intelvision.annotation.Param;
import cn.intelvision.annotation.Stream;
import cn.intelvision.http.HttpService;
import cn.intelvision.http.JsonMapper;
import cn.intelvision.request.ZenoRequest;
import cn.intelvision.response.ZenoResponse;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        boolean hasFile = false;
        for (Field field : fields) {
            field.setAccessible(true);
            BinFile binFile = field.getAnnotation(BinFile.class);
            if (binFile != null) {
                try {
                    if (field.get(request) != null) {
                        FileBody img = new FileBody((File) field.get(request));
                        builder.addPart(binFile.name(), img);
                        hasFile = true;
                        continue;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
            Stream stream = field.getAnnotation(Stream.class);
            if (stream != null) {
                try {
                    if (field.get(request) != null) {
                        InputStreamBody body = new InputStreamBody((InputStream) field.get(request), "");
                        builder.addPart(stream.name(), body);
                        hasFile = true;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        HttpEntity entity = null;
        if (hasFile) {
            for (Field field : fields) {
                Param param = field.getAnnotation(Param.class);
                if (param != null) {
                    try {
                        Object o = field.get(request);
                        if (o != null) {
                            StringBody body = new StringBody(o.toString(), ContentType.create("text/plain", "UTF-8"));
                            builder.addPart(param.name(), body);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            StringBody key = new StringBody(apiKey, ContentType.create("text/plain", "UTF-8"));
            builder.addPart("api_key", key);
            StringBody secret = new StringBody(apiSecret, ContentType.create("text/plain", "UTF-8"));
            builder.addPart("api_secret", secret);
            entity = builder.build();
        } else {
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            for (Field field : fields) {
                field.setAccessible(true);
                Param param = field.getAnnotation(Param.class);
                if (param != null) {
                    try {
                        Object o = field.get(request);
                        if (o != null) {
                            nvps.add(new BasicNameValuePair(param.name(), o.toString()));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            nvps.add(new BasicNameValuePair("api_key", apiKey));
            nvps.add(new BasicNameValuePair("api_secret", apiSecret));
            try {
                entity = new UrlEncodedFormEntity(nvps, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        if (entity != null) {
            HttpPost post = new HttpPost(serviceUrl + request.getApi());
            post.setEntity(entity);
            try {
                CloseableHttpResponse response = HttpService.getHttpClient().execute(post);
                HttpEntity resEntity = response.getEntity();
                String result = EntityUtils.toString(resEntity);
                return JsonMapper.readValue(result, responseClass);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
