package internetOpreation;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Socket连接主机
 */
public class ConnectPC {
    public static void main(String[] args) {
        try (Socket socket = new Socket("www.baidu.com", 80)){
        InetAddress addr = socket.getInetAddress();
        System.out.println("连接到"+addr);
        } catch (IOException e) {
            System.out.println("连接失败");
            e.printStackTrace();
        }
    }
}
