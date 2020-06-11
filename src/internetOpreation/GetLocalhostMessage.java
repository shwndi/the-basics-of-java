package internetOpreation;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取主机信息
 */
public class GetLocalhostMessage {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost.getHostName());
            System.out.println(localHost.getHostAddress());
            System.out.println(localHost.getAddress().toString());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
