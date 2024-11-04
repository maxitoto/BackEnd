package RepasoJava.TiposDeDatos.Definiciones;

public class TiposDeVariables {
    //este contador al ser estatico es conocido por todas las instancias, es unico y se crea una unica vez.
    //se llama variable estatica
    public static int contadorDeClase = 0;

    //este atributo se crea uno nuevo cada vez que se instancia un objeto, pertenece al objeto y es conocido solo por el.
    //se llama variable de instancia
    public int contadorPropio = 0;

    public static void hacerAlgo() {
        //este metodo es conocido por todas las instancias de esta clase, al igual que la variable estatica.
    }

    
    public int hacerOtraCosa(){
        //este contador es solo conocido por el cuerpo del metodo y nadie más. una vez termina desaparace.
        //se llama variable local
        int contadorLocal = 0;

        return contadorLocal;
    }
}
