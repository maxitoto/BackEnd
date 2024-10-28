package RepasoJava.Multithreading.implementarRun;

public class HiloEjemplo extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Hola soy un hilo");
            Thread.sleep(2400);
            System.out.println("Adios soy un hilo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
