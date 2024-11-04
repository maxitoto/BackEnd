package RepasoJava.Poo.Clase;

public class Persona {
    //atributos
    private static int dniglobal = 0;

    private int dnipersonal;

    public Persona(){
        this.dnipersonal = dniglobal;
        dniglobal += 1;
    }

    public int getDni(){
        return this.dnipersonal;
    }
}
