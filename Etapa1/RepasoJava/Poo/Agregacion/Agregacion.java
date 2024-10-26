package RepasoJava.Poo.Agregacion;

import java.util.ArrayList;
import java.util.List;

//Agregacion: Tiene Un...

public class Agregacion {
    public static void main(String[] args) {
        
        //creo una lista
        List<NumeroCelular> directorio = new ArrayList<NumeroCelular>();

        //creo una persona
        Persona persona = new Persona("Tomas Blanco", directorio);

        //creo un numero de celular
        NumeroCelular numerocelular_1 = new NumeroCelular(15411203);

        //creo un numero de celular
        NumeroCelular numerocelular_2 = new NumeroCelular(5355178);

        //el ultimo numero agendado se llama objeto anonimo
        persona.agendar(numerocelular_1, numerocelular_2, new NumeroCelular(29174242));

        //los numeros estan en el objeto directorio no en Persona directamente
    }
    
}