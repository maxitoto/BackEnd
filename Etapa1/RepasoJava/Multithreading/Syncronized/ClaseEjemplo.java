package RepasoJava.Multithreading.Syncronized;

public class ClaseEjemplo implements Runnable{
    static int contid = 0;
    int id;
    public ClaseEjemplo(){
        synchronized (ClaseEjemplo.class) { //para evitar condicion de carrera, ya que contid es un recurso compartido
            this.id = contid;
            contid++;
        }
    }


    public synchronized static String unoAlaVez(){
        return "A dentro!!"; //DEBERIA HABER SOLO UN PROCESO A LA VEZ
    }

    @Override
    public void run() {
        System.out.println("hilo "+id+" dice "+ClaseEjemplo.unoAlaVez());
    }

}
