package Etapa1.RepasoJava.SealedClass.InterfaceYRecordYClase;

//es utilizado en la programacion orientada a datos

public sealed interface Nodo permits NodoEstatico, NodoDinamico {
    
    String nombre();//identificadores nombrados como variables para que el record que implementa los autosobreescriba
    int edad();
}
