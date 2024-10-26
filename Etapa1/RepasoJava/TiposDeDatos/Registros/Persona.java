

import java.time.LocalDate;
import java.time.Month;

public class Persona {
    private static long CONT_ID = 0;
    private String nombre;
    private DatosPersonales datospersonales;


    public Persona(String nombre, int documento, LocalDate FechaNacimiento){
        this.nombre=nombre;
        datospersonales = new DatosPersonales(CONT_ID , documento, FechaNacimiento, LocalDate.now());
        CONT_ID++;
    }

    public DatosPersonales getDatospersonales() {
        return datospersonales;
    }

    @Override
    public String toString() {
        return "nombre: "+nombre+" "+ datospersonales.toString();
    }

    ///public static void main(String[] args){
    ///     System.out.println("Hola");
    ///}

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Persona persona = new Persona("Tomas", 42011082, LocalDate.of(2000, Month.MAY, 26));
                System.out.println(persona.toString());
                System.out.println("Edad de "+persona.nombre+": "+persona.getDatospersonales().calcularEdad());
                System.out.println(DatosPersonales.getCONTADOR_DE_REGISTRO());
            }
            
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

