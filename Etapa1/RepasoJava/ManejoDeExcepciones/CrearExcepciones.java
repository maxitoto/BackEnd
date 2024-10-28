package RepasoJava.ManejoDeExcepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

//crear una excepcion
public class CrearExcepciones extends Exception{
    public CrearExcepciones(String message){
            super(message);
    }

    //Tambien los desarrolladores pueden iniciar excepciones y los metodos pueden hacer throws
    public static void main(String... args ) throws CrearExcepciones{
        int edad = -1;
        try{
            if(edad<0){
                throw new CrearExcepciones("La edad es Errronea");}
        }catch(CrearExcepciones e){
            System.out.println(e.getMessage());
        }
    }


    /*Cuando un método puede potencialmente producir una excepción pero no la controla, la excepción debe declararse utilizando la palabra clave throws en la firma del método. Esto notifica al autor de la llamada que el método puede producir la excepción especificada y que el autor de la llamada debe controlarla o propagarla aún más. */
    public void readFile(String filePath) throws FileNotFoundException, IOException {
        // Code that may throw exceptions
    }
}

