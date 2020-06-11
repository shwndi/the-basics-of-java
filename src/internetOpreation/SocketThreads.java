package internetOpreation;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class SocketThreads {
    Socket socket;
    SocketThreads(Socket socket) {
        this.socket = socket;
    }
    public void run(){
        try {
            PrintStream stream = new PrintStream(socket.getOutputStream());
            for (int i = 100; i > 0; i--) {
                stream.println(i);
            }
            stream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
