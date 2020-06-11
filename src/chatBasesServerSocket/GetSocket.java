package chatBasesServerSocket;


import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 监听类：负责获取连接的客户端
 */
public class GetSocket extends Thread {
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8848);
            while (true) {
                //建立连接，获取socket对象
                Socket accept = serverSocket.accept();
                //消息提示框
                JOptionPane.showMessageDialog(null, "there is costumer set connection!");
                //与客户端通信
                ChatSocket cs=new ChatSocket(accept);
                new Thread((Runnable)cs).start();
                //添加到socket队列
                ChatManager.GetChatManager().AddChatPeople(cs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
