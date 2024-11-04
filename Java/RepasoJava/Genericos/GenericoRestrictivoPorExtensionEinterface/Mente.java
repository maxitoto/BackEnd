package RepasoJava.Genericos.GenericoRestrictivoPorExtensionEinterface;

import RepasoJava.Genericos.GenericoRestrictivoPorExtensionEinterface.Generico;

public class Mente{
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        Generico<Persona> gp = new Generico<>();
        gp.ejecutarAccion(persona);
    }
}
