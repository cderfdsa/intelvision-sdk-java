package com.zeno.intelvision.http;

import javax.net.ssl.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.UUID;

/**
 * @author Ma
 * @since 2016-03-30
 */
public class HttpService {

    private static final String PREFIX = "--";
    private static final String LINE_END = "\r\n";
    private static final String MULTIPART_FROM_DATA = "multipart/form-data";
    private static final int TIME_OUT = 30000;
    private static final String CHARSET = "UTF-8";

    private static final HttpService httpService = new HttpService();

    private HttpService() {
    }

    public static HttpService getHttpService() {
        return httpService;
    }


    private HttpsURLConnection getHttpsURLConnection(String urlStr) {
        HttpsURLConnection httpsUrl = null;
        TrustManager[] tm = {new MyX509TrustManager()};
        try {
            URL url = new URL(urlStr);
            httpsUrl = (HttpsURLConnection) url.openConnection();
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            sslContext.init(null, tm, new java.security.SecureRandom());
            SSLSocketFactory ssf = sslContext.getSocketFactory();
            httpsUrl.setSSLSocketFactory(ssf);
            httpsUrl.setDoInput(true);
            httpsUrl.setDoOutput(true);
            httpsUrl.setUseCaches(false);
            httpsUrl.setConnectTimeout(TIME_OUT);
            httpsUrl.setReadTimeout(TIME_OUT);
            httpsUrl.setRequestProperty("Charset", CHARSET);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return httpsUrl;
    }

    public String getRequest(String url, Map<String, String> params) {
        OutputStreamWriter out = null;
        HttpsURLConnection httpsUrl = getHttpsURLConnection(url);
        try {
            httpsUrl.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpsUrl.setRequestMethod("GET");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (!"".equals(sb.toString())) {
                    sb.append("&");
                }
                sb.append(entry.getKey()).append("=")
                        .append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            out = new OutputStreamWriter(httpsUrl.getOutputStream());
            out.write(sb.toString());
            out.flush();
            return getResult(httpsUrl);
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            httpsUrl.disconnect();
        }
        return "";
    }

    public String postRequest(String url, Map<String, String> params, Map<String, File> files) {
        String boundary = UUID.randomUUID().toString();
        DataOutputStream out = null;
        InputStream is = null;
        HttpsURLConnection httpsUrl = getHttpsURLConnection(url);
        try {
            httpsUrl.setRequestProperty("Content-Type", MULTIPART_FROM_DATA + ";boundary=" + boundary);
            httpsUrl.setRequestMethod("POST");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                sb.append(PREFIX);
                sb.append(boundary);
                sb.append(LINE_END);
                sb.append("Content-Disposition: form-data; name=\"").append(entry.getKey())
                        .append("\"").append(LINE_END);
                sb.append("Content-Type: text/plain; charset=" + CHARSET + LINE_END);
                sb.append("Content-Transfer-Encoding: 8bit" + LINE_END);
                sb.append(LINE_END);
                sb.append(entry.getValue());
                sb.append(LINE_END);
            }
            out = new DataOutputStream(httpsUrl.getOutputStream());
            out.write(sb.toString().getBytes(CHARSET));
            for (Map.Entry<String, File> file : files.entrySet()) {
                sb = new StringBuilder();
                sb.append(PREFIX);
                sb.append(boundary);
                sb.append(LINE_END);
                sb.append("Content-Disposition: form-data; name=\"")
                        .append(file.getKey()).append("\"; filename=\"")
                        .append(file.getKey()).append("\"").append(LINE_END);
                sb.append("Content-Type: application/octet-stream; charset=" + CHARSET + LINE_END);
                sb.append(LINE_END);
                out.write(sb.toString().getBytes());

                is = new FileInputStream(file.getValue());
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
                out.write(LINE_END.getBytes());
            }
            out.write((PREFIX + boundary + PREFIX + LINE_END).getBytes());
            out.flush();
            return getResult(httpsUrl);
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            httpsUrl.disconnect();
        }
        return "";
    }

    private String getResult(HttpsURLConnection httpsUrl) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(httpsUrl.getInputStream(), CHARSET));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "";
    }

    class MyX509TrustManager implements X509TrustManager {

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }
}
