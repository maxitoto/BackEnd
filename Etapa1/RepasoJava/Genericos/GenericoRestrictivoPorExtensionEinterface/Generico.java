package RepasoJava.Genericos.GenericoRestrictivoPorExtensionEinterface;

//solo los que extiendan de persona e implementen una acciongenerica al mismo tiempo pueden instanciar la clase Generico

public class Generico<T extends Persona & AccionGenerica> {
    public void ejecutarAccion(T obj) {
        obj.accion();
        System.out.println("Nombre: " + obj.nombre());
    }
}



