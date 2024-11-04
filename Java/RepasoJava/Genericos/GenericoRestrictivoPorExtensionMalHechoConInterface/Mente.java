package RepasoJava.Genericos.GenericoRestrictivoPorExtensionMalHechoConInterface;

public class Mente{
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        GenericoMalHecho<Persona,AccionGenerica> gpa = new GenericoMalHecho<Persona,AccionGenerica>();//no es correcto, no puedo instanciar AccionGenerica
        gpa.ejecutarAccion(persona);
    }
}
