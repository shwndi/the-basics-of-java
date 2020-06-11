package internetOpreation;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 解析URL
 */
public class GetURLMessage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://sale.alibaba.com/pages/dnq8s2323/index.html?spm=a2700.8293689.201702.3.2ce267afukg4Ip&path=/pages/duo5wi3ny/index.html&deliveryId=1603501_901318402_STOCK_9_52415957&topOfferIds=51778564&tracelog=20200609_ICBU_HOME_MAIN_BANNER_ICBU_HOME_MAIN_BANNER_SLIDER_3_T");
            System.out.println("URL："+url);
            System.out.println("URL："+url.toString());
            System.out.println("协议："+url.getProtocol());
            System.out.println("文件名：" + url.getFile());
            System.out.println("主机：" + url.getHost());
            System.out.println("路径：" + url.getPath());
            System.out.println("端口号：" + url.getPort());
            System.out.println("默认端口号： "
                    + url.getDefaultPort());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
