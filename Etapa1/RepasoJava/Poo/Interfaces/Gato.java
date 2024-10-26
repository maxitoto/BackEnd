package RepasoJava.Poo.Interfaces;

public class Gato implements Animal, Alimertarse{

    @Override
    public String sonido() {
        return "Miau...";
    }

    @Override
    public String comer() {
        return "Comer comida para gato";
    }
    
}
