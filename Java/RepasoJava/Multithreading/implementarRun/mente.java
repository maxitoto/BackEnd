package RepasoJava.Multithreading.implementarRun;

public class mente {
    public static void main(String[] args) {
        HiloEjemplo he = new HiloEjemplo();
        he.start();

        EjecutableEjemplo ee = new EjecutableEjemplo();
        Thread thread = new Thread(ee); //creo un hilo que ejecturá el run que implemento la clase EjecutableEjemplo
        thread.start();
        
    }
}
