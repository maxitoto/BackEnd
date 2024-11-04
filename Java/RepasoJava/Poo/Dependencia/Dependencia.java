package RepasoJava.Poo.Dependencia;

//Dependencia: Usa a...

public class Dependencia {
    public static void main(String[] args) {
        //creo una persona
        Persona persona = new Persona("Tomas Blanco");

        //la persona llama al numero de telefono y debe esperar la comprobancion de otra clase dentro del metodo llamar.
        persona.llamar(5355178);
    }
    
}