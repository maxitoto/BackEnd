package RepasoJava.ManejoDeExcepciones.TipoError;

public class MemoriaVirtualAgotada {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] array = new int[Integer.MAX_VALUE]; //este fallo es de tipo ERROR y hereda de Throwable.
        //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit 
    }
}
