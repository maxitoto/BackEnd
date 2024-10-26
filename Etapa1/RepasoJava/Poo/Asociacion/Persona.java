package RepasoJava.Poo.Asociacion;

public class Persona {
    
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //asociacion: el metodo llamar utiliza el metodo del objeto pasado por argumento, por eso esta asociado. si no hay numero de celular no es posible realizar el llamado(error en compilacion por no argumento).
    public void llamar(NumeroCelular numerocelular) {
        System.out.println("Llamando al celular : "+numerocelular.getNumero());
    }

    public String getNombre() {
        return nombre;
    }
    

}