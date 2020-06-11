package internetOpreation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 查看主机指定文件修改时间
 */
public class TheUpdateTimeAboutPC {
    public static void main(String[] args) {
        try {
            URL url = new URL("file:///D:/aa.sql");
            URLConnection connection = url.openConnection();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss");
            connection.setUseCaches(false);
            long timesStamp = connection.getLastModified();
            System.out.println("修改时间为："+format.format(new Date(timesStamp)));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
