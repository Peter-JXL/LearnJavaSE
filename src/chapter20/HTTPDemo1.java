package chapter20;

import javax.net.ssl.HttpsURLConnection;
import java.io.InputStream;
import java.net.URL;
import java.util.*;

public class HTTPDemo1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.peterjxl.com");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setUseCaches(false);
        conn.setConnectTimeout(5000); //设置超时时间为5秒

        // 设置HTTP头
        conn.setRequestProperty("Accept", "*/*");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 11; Windows NT 5.1)");

        // 连接并发送HTTP请求:
        conn.connect();

        // 判断HTTP响应是否200:
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("bad response");
        }

        // 获取所有响应Header:
        Map<String, List<String>> map = conn.getHeaderFields();
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // 获取响应内容:
        InputStream input = conn.getInputStream();
        // 用流的方式读取.....

    }
}
