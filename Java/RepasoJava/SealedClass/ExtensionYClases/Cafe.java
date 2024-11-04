package RepasoJava.SealedClass.ExtensionYClases;

//es obligatorio que sea final para granatizar que nadie pueda heredar de cafe y saltarse la restriccion impuesta por desayuno
public final class Cafe extends Desayuno {
    
}

/*
curiosidad de clases final

si tu clase final hereda de otra clase, la clase padre aún podría crear una instancia de la clase final y utilizar sus metodos, esto pasa igual aunque no se utilize el final, pero la inmutabilidad aqui es curiosa.

public abstract class Padre{
    public void metodo(){
        Hijo miHijo = new Hijo();

        miHijo.hablar();
    }

}

public final hijo extends Padre{
    ...
}
 */