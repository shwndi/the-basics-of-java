package internetOpreation;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1、获取主机IP地址
 * 2、post是否被占用
 */
public class GetAddress {
    public static void main(String[] args) {
        System.out.println("==================查看ip地址===================");
        InetAddress address = null;
        try {
            address = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            System.exit(2);
            e.printStackTrace();
        }
        System.out.println(address.getHostName() + "=" + address.getHostAddress());
        System.out.println(address.getAddress());
        System.out.println(address.getCanonicalHostName());
        //System.exit(0);
        System.out.println("==================查看端口===================");
        Socket socket;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 1024; i < 1111; i++) {
            try {
                System.out.println("查看端口" + i);
                socket = new Socket(host, i);
                System.out.println("端口" + i + "已被使用");
            }catch (UnknownHostException e){
                System.out.println("Exception occured"+ e);
                break;
            } catch (IOException e) {
            }
        }
    }
}
