package RepasoJava.Metodos.InterfaceFuncionalPropia;

public class Mente {
   
    public static void main(String[] args) {
        Ejemplo instance = () -> { System.out.println("Implementación del método abstracto");};
        instance.metodo();
        instance.saludar();
    }
}
