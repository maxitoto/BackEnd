package RepasoJava.Poo.Herencia;

//Asociacion Es Un... (Herencia)


//en este caso es abstracto porque no todas las personas corren igual de rápido por lo tanto hay un metodo vacio y tambien comparten atributos todas las personas
public abstract class Persona{
    //atributos
    private static int dniglobal = 0;

    protected int dnipersonal;

    protected int edad;

    public Persona(int edad){
        if(edad>=0){
            this.dnipersonal = dniglobal;
            dniglobal += 1;
            this.edad = edad;
        }
    }

    public int getDni(){//encampusalcion 
        return this.dnipersonal;
    }

    public int getEdad(){
        return this.edad;
    }

    public abstract void correr(); //Polimorfismo

}