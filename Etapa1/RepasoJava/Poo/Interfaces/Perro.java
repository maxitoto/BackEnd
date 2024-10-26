package RepasoJava.Poo.Interfaces;

public class Perro implements Animal, Alimertarse{

    @Override
    public String sonido() {
        return "Uau...";
    }

    @Override
    public String comer() {
        return "Comer comida para perro"; 
    }
    
}
