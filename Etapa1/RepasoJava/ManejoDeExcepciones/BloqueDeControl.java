package RepasoJava.ManejoDeExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BloqueDeControl {
    public static void main(String[] args) {

        try {
            //intentar esto...
        } catch (Exception e) {
            //si ocurre cualquier tipo de falla, hace esto...
        }

        //"e" es la expecpion puede ser más espacifica, por ejemplo  catch(ArithmeticException e)
        //generalmente se coloca Excepcion, porque todas las excepciones heredan de ella, si una excepcion que es diferente a ArithmeticException detendría el programa

        try {
            //intentar esto
        } catch (ArithmeticException | NullPointerException e) {
            //si ocurre ArithmeticException o NullPointerException, hace esto... (caso contrario el programa se detiene)
        }


        //try de tipo: try-with-resources. Esta estructura fue introducida en Java 7 y se utiliza para gestionar automáticamente recursos que implementan la interfaz AutoCloseable
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            // Operaciones con el recurso
        } catch (IOException e) {
            // Manejo de excepciones
        }

        
        //catch anidados
        try {
            // intenta esto
        } catch (ArithmeticException e) {
            // intenta esto
        } catch (NullPointerException e) {
            // intenta esto
        } catch (Exception e) {
            // intenta esto
        }


        //finally. permite ejecutar un modulo siempre. conveniente para cerrar archivos si ocurre un fallo y tambien dejar consistencia de datos en la clase o otras clases.
        try {
            //intenta esto
        } catch (Exception e) {
            // intenta esto
        } finally {
            //me da igual si sale bien o mal en el try/catch. este espacio siempre se ejecturá
        }
    }


   
}
