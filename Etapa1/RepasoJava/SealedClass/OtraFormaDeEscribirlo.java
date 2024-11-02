package Etapa1.RepasoJava.SealedClass;

public sealed interface OtraFormaDeEscribirlo {
    public String nombre();

}

record registro(String nombre) implements OtraFormaDeEscribirlo{
//podria implementar pero es automatico, siempre y cuando el atributo en el argumento tenga el mismo id que el metodo a implementar
}

final class Clase implements OtraFormaDeEscribirlo{

    @Override
    public String nombre() {
       return "Tomas";
    }
    
}
