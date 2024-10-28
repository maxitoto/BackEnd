package RepasoJava.Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;


public class Servidor extends datos implements Runnable{

    public Servidor(){
        super();
        try {
            super.socketServer.setSoTimeout(10000);
        }catch(IOException e){System.err.println(e.getMessage());}
    }
    
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("El servidor esta escuchando en el puerto "+socketServer.getLocalPort());
                Socket servidor = socketServer.accept();
                System.out.println("Escuchando el socket: " + servidor.getRemoteSocketAddress());
                DataInputStream entrada = new DataInputStream(servidor.getInputStream());
                System.out.println("Chat Recibido: "+entrada.readUTF());
                DataOutputStream salida = new DataOutputStream(servidor.getOutputStream());
                salida.writeUTF("Mensaje recibido, gracias por comunicarte con el servidor "+servidor.getLocalSocketAddress());
                servidor.close();
            }
            catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
            }
            catch(IOException e){System.err.println(e.getMessage());}
            
        }
    }
    
    
}
