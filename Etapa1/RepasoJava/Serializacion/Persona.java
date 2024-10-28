package RepasoJava.Serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int dni;
    private transient String dato = "este dato no será serializado";
    private static String datodos = "este dato no será serializado por que pertenece a la clase y no al objeto";

    /*
     El proceso de serialización en tiempo de ejecución asocia un identificador a cada clase Serializable que se conoce como SerialVersionUID. Se utiliza para verificar el remitente y el receptor del objeto serializado. El emisor y el receptor deben ser los mismos. Para comprobarlo, se usa SerialVersionUID. El remitente y el receptor deben tener el mismo SerialVersionUID, de lo contrario, se producirá InvalidClassException al deserializar el objeto.
     */
    private static final long serialVersionUID=1L;

    public Persona(String nombre, String apellido, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido+ " DNI: "+ dni;
    }
}
