package RepasoJava.Poo.Asociacion;

public class NumeroCelular {

    private int numero;

    public NumeroCelular(int numero) {
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
