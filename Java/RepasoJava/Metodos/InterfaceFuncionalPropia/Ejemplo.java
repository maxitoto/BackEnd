package Java.RepasoJava.Metodos.InterfaceFuncionalPropia;

@FunctionalInterface
public interface Ejemplo {

    void metodo();

    default String saludar(){ //la razon de escribir default es que una interface cualquiera, solo puede tener cuerpo los metodos estaticos o defaults
        return "Hola";
    }
    
}