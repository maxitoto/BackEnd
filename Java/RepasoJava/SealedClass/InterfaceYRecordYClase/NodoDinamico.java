package RepasoJava.SealedClass.InterfaceYRecordYClase;

//recordemos que record es final por defincion, no puede extender de otra clase y tampoco de otro record

public record NodoDinamico(String nombre, int edad) implements Nodo{
//como los metodos a implementar se llaman igual que los gets autocompletados del record nombre() y edad() entonces se hace solo. 
//Execelente!

//otra alternativa:
    /*
Podemos implementar los metodos de la interface nodo o sino, podemos simplemente crear los datos en el argumento del registro, no por casualidad los identificadores de los metodos a implementar, les colocoque un nombre de variable, ya que un record genera automaticamente metodos get que son --> atributo()     ,  Una clase normal es getAtributo()

    @Override
    public String nombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nombre'");
    }

    @Override
    public int edad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'edad'");
    }

    */

}
