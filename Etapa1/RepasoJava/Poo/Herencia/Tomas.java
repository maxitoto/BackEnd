package RepasoJava.Poo.Herencia;

public class Tomas extends Persona{
    
    protected String apellido;
    //padre tiene dni y edad

    public Tomas(String apellido, int edad){
        super(edad);
        this.apellido=apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    @Override
    public void correr(){
        System.out.println("Yo corro a 12kmH");
    }
   

}