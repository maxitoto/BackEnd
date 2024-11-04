package RepasoJava.Poo.Dependencia;

public class Persona {
    
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //dependecia: el metodo depende del metodo de otra clase, una vez termina la referencia se pierde
    public void llamar(int numero) {
        LineaMovil lineaMovistar = new LineaMovil();

        lineaMovistar.ConectarALaRed(numero);//esta clase depende del metodo de otra clase

        System.out.println("Llamando al celular : "+numero);
    }

    public String getNombre() {
        return nombre;
    }
    

}