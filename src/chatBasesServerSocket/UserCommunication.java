package chatBasesServerSocket;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 建立通信（用户）
 */
public class UserCommunication {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8848);
            //构建IO
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            //输入消息
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
            System.out.print("please input message:");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            writer.write(s);
            writer.flush();

            //读取服务器返回的消息
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String mess = reader.readLine();
            System.out.println("服务器："+mess);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
