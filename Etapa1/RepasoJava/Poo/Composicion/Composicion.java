package RepasoJava.Poo.Composicion;

//Composicion: Es parte de...

public class Composicion {
    public static void main(String[] args) {
        
        //creo una persona
        Persona persona = new Persona("Tomas Blanco", 5355178);

        System.out.println("Nombre: "+persona.getNombre()+" Celular: "+persona.getCelular());
    }
    
}