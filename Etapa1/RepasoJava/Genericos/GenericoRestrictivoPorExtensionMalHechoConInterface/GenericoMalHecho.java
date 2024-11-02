package RepasoJava.Genericos.GenericoRestrictivoPorExtensionEinterface;

public class GenericoMalHecho <T extends Persona, AccionGenerica> {
        public void ejecutarAccion(T obj) {
            //pero obj.accion(); no funciona porque el generico no sabe si el objeto lo implementará, osea hago control+espacio y no sale el metodo accion(); es ambiguo para java
            System.out.println("Nombre: " + obj.nombre());
        }
}
