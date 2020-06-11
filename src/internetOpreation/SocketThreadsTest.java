package internetOpreation;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 程序未能跑通
 */
public class SocketThreadsTest {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(1024);
            System.out.println("Listen.....");
            while(true){
                Socket accept = socket.accept();
                System.out.println("连接");
                new Thread((Runnable) new SocketThreads(accept)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
