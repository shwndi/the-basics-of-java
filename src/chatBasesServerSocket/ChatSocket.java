package chatBasesServerSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

/**
 * 客户端的通信，向客户端发送和输出信息，实现单独线程的通信
 */
public class ChatSocket {
    Socket socket;

    public ChatSocket(Socket socket) {
        this.socket = socket;
    }

    /*
     *向客户端输出信息
     */
    public void Out(String str) {
        try {
            socket.getOutputStream().write(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     *
     * 向客户端发送消息
     */
    public void run() {
        Out("success\n");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                ChatManager.GetChatManager().Send(this, line);
            }
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
