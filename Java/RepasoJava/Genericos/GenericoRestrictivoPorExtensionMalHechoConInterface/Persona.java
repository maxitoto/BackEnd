package RepasoJava.Genericos.GenericoRestrictivoPorExtensionMalHechoConInterface;

public record Persona(String nombre, int edad) implements AccionGenerica{

    @Override
    public void accion() {
        System.out.println("Realizo accion");
    }
    
}
