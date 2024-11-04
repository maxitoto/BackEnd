package RepasoJava.ManejoDeExcepciones.TipoExcepcion;
/* 
    Excepciones comprobadas: se trata de excepciones que se comprueban en tiempo de compilación, lo que significa que el compilador aplica el control de estas excepciones. 
    Algunos ejemplos son IOException, SQLException y ClassNotFoundException.
*/

import java.io.BufferedReader;
import java.io.FileReader;

public class ExcepcionesControladas {
   
    public static void main(String[] args) {

        String rutaArchivo = "C:\\Users\\tommy\\Desktop\\NoExiste.txt";
        
        BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
          
        //Esto nisiquiera funciona, porque está controlado, es requisito implementar un bloque de control de excepcion o implementar la expcepcion

        /*  Exception in thread "main" java.lang.Error: Unresolved compilation problems:
            Unhandled exception type FileNotFoundException
            Unhandled exception type IOException
        */
    }
}