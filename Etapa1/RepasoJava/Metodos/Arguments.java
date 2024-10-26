package RepasoJava.Metodos;

public class Arguments {

    public static void argumentosConPunto(int a, int b, int ...v) {}//esto no da error, pero al momento de llamar al metodo no le gusta, le resulta ambiguo porque no sabe cuando termianan las variables int individuales y comienza el arreglo de int
    
    public static void argumentosConPunto(int ...numeros) {}
    //aca ocurre algo curioso, como esta sobre cargado con (int a, int b, int ...v) ahora este metodo que solo tiene el arreglo de int es rechazado al intentar llamarlo

    //public void argumentosConPunto(int[] numeros) {} error
    public static void argumentosConPunto(Integer[] numerosObjets) {}


    public static void argumentosConPunto(int a, int b, String ...v) {}

    public static void main(String[] args) {
        //argumentosConPunto(1,2, 4,5,6,7); 
        //El método argumentosConPunto(int, int, int[]) es ambiguo para el tipo ArgumentosJava

        //argumentosConPunto(1,2,3,4,5); funcion si elimino la sobre carga de argumentosConPunto(1,2, 4,5,6,7); 

        argumentosConPunto(1,2, "Hola","Adios","etc");
    }

}


