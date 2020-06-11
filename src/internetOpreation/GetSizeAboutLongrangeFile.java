package internetOpreation;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 获取远程文件大小
 * 1、设置连接地址
 * 2、打开链接对象
 * 3、获取数据
 * 4、关闭连接
 */
public class GetSizeAboutLongrangeFile {
    public static void main(String[] args) throws Exception {
        int size;
        URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url.openConnection();
        size = conn.getContentLength();
        if (size < 0)
            System.out.println("无法获取文件大小。");
        else
            System.out.println("文件大小为：" + size + " bytes");
        conn.getInputStream().close();
        URL url1 = new URL("https://img-blog.csdnimg.cn/20181224165832256");
        URLConnection connection = url1.openConnection();
        Object content = connection.getContent();
        System.out.println(content);
        int contentLength = connection.getContentLength();
        long contentLengthLong = connection.getContentLengthLong();
        System.out.println(contentLength);
        System.out.println(contentLengthLong);
        connection.getInputStream().close();


    }
}
