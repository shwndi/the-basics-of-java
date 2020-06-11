package internetOpreation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 1、获取响应头日期信息
 * 2、获取响应头信息
 */
public class GetQueryMessage {
    public static void main(String[] args) {
        System.out.println("=====================请求相应时间获取===================");
        try {
            URL url = new URL("https://www.alibaba.com");
            URLConnection connection = url.openConnection();
            HttpURLConnection connection1 = (HttpURLConnection) connection;
            long date = connection.getDate();
            long date1 = connection1.getDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println("URLConnection日期是："+format.format(new Date(date)));
            System.out.println("HttpURLConnection日期是："+format.format(new Date(date1)));
            connection.getInputStream().close();
            connection1.getInputStream().close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==================请求头获取===================");
        try{
            URL url = new URL("https://www.alibaba.com");
            URLConnection connection = url.openConnection();
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            Set<String> strings = headerFields.keySet();
            Collection<List<String>> values = headerFields.values();
            Set<Map.Entry<String, List<String>>> entries = headerFields.entrySet();
            connection.getInputStream().close();
            System.out.println("keys:"+strings);
            System.out.println("values:"+values);
            System.out.println("<key,value>:"+entries);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
