package RepasoJava.Poo.Asociacion;

//Asociacion: conoce a...

public class Asociacion {
    public static void main(String[] args) {
        //creo una persona
        Persona persona = new Persona("Tomas Blanco");

        //creo un numero de celular
        NumeroCelular numerocelular = new NumeroCelular(15411203);

        //la persona "llama" mediante un metodo. 
        //le pasamos un numero de celular
        persona.llamar(numerocelular);
    }
    
}