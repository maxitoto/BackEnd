package RepasoJava.Poo.Agregacion;

import java.util.List;

public class Persona {
    
    private String nombre;
    private List<NumeroCelular> directorio;

    public Persona(String nombre, List<NumeroCelular> directorio) {
        this.nombre = nombre;
        this.directorio = directorio;
    }

    //agregacion: la clase persona no tiene directamente un numero de celular, en realidad la clase Lista los contiene. es una asociacion debil, si la persona puede tener un directorio completamente vacios
    public void agendar(NumeroCelular ...numeroscelular) {
        for (NumeroCelular numerocelular : numeroscelular){
            directorio.add(numerocelular); 
        }
    }

    public String getNombre() {
        return nombre;
    }
    

}