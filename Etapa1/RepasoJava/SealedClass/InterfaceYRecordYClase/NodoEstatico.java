package Etapa1.RepasoJava.SealedClass.InterfaceYRecordYClase;


public final class NodoEstatico implements Nodo {

    @Override
    public String nombre() {
        return "Tomas";
    }

    @Override
    public int edad() {
        return 24;
    }

}
