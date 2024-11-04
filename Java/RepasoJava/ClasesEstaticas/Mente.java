package RepasoJava.ClasesEstaticas;
import RepasoJava.ClasesEstaticas.ClaseExterna.ClaseAnidada;

public class Mente {
    public static void main(String[] args) {
        ClaseAnidada claseanidad = new ClaseAnidada();//puedo crear una instancia de una clase que esta dentro de otra, sin crear una instancia de la clase externa

        ClaseExterna claseexterna = new ClaseExterna();
    }
}
