package chatBasesServerSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 建立通信(服务器)
 */
public class ServiceCommunication {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8848);
            System.out.println("启动服务器ing·····");
            Socket socket = serverSocket.accept();
            while(true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //读取信息
                String message = reader.readLine();
                System.out.println("客户端：" + message);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.write("service send message to user ,message:" + message);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){

        }
    }
}
