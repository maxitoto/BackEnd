package RepasoJava.Multithreading.Syncronized;

public class mente {
    public static void main(String[] args) {
        ClaseEjemplo c1 = new ClaseEjemplo();
        ClaseEjemplo c2 = new ClaseEjemplo();

        Thread hilo1 =new Thread(c1);
        Thread hilo2 =new Thread(c2);

        hilo1.start();
        hilo2.start();


    }
}
