package RepasoJava.Poo.Herencia;

//en este tipo de herencia, tomas ya no es una clase abstracta, pero aun comparten atributos, solo tiene que sobre escribir el metodo correr.
public class TomasJr extends Tomas{

    public TomasJr(String apellido, int edad) {
        super(apellido, edad);
    }

    @Override
    public void correr(){
        System.out.println("Yo corro a 18kmH");
    }

    //esta clase ya no necesita nada, todo lo hereda, así no repetimos codigo.
}