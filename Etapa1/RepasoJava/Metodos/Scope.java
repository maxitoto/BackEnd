package RepasoJava.Metodos;

public class Scope {
    public static void main(String[] args) {
        int a=5, b=3;
        
        
        {
            System.out.println(a+b);//8
            a = 2; 
            b = 2;
            System.out.println(a+b);//4
        }

        System.out.println(a+b);//4
        //conclusion, "{}" no es un metodo anónimo.


        //PERO cualquier variable declarada dentro si es anonima
        {
            int c = 5;
            System.out.println(c);

            //int a = 10; tampoco puedo declarar una variable ya declarada dentro del bloque
        }
        //System.out.println(c); = error, c no es conocida
    }
}
