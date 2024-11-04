package RepasoJava.Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Cliente extends datos{
    static String text;

    public Cliente(){
        super();
    }


    public static void enviar(String text){
        try{
            OutputStream salidaAServer = socketCliente.getOutputStream();
            DataOutputStream salida = new DataOutputStream(salidaAServer);
            salida.writeUTF("Hola desde " + socketCliente.getLocalSocketAddress()+" Chat: "+text);
            System.out.println("Enviado!");
            DataInputStream entrada = new DataInputStream(socketCliente.getInputStream());
            System.out.println("Servidor dice: "+entrada.readUTF());
        }catch(IOException e){System.err.println(e.getMessage());}
    }

    public static void main(String[] args) {
        

        Servidor server = new Servidor();

        Thread hilo = new Thread(server);

        hilo.start();

        
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        Cliente cliente = new Cliente();
        cliente.enviar(text);


        
        
        
        
    }
}
