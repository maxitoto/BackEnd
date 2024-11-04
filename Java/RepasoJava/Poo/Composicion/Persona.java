package RepasoJava.Poo.Composicion;

public class Persona {
    
    private String nombre;
    private Celular celular; 

    public Persona(String nombre, int numerocelular) {
        this.nombre = nombre;
        this.celular = new Celular(numerocelular);
    }

    //composicion: la clase persona tiene directamente una referencia a un celular, si es borrado el celular tambien.

    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
    

}