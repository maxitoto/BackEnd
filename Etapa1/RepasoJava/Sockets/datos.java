package RepasoJava.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class datos {
    protected static final String URL = "192.168.1.12";
    protected static final int PORT = 8000;
    protected static Socket socketCliente;
    protected static ServerSocket socketServer;

    public datos(){
        try {
            if (socketServer == null) { this.socketServer = new ServerSocket(PORT);}

            if (socketCliente == null) {this.socketCliente = new Socket(URL, PORT);}

        } catch (IOException e) {System.err.println(e.getMessage());}
        
        
    }
}
