package RepasoJava.Poo.Composicion;

public class Celular {

    private int numero;

    public Celular(int numero) {
       this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return ""+numero;
    }
}
