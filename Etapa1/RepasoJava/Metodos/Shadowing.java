package RepasoJava.Metodos;

public class Shadowing {

    static int x = 50;//java hace diferencia por clase o instancia

    //forma correcta static int X = 50;

    public static void main(String[] args) {
        System.out.println(x);//esto hace referencia a la variable estatica de clase

        int x = 50;

        System.out.println(x);//ahora hace referencia a la variable local
    }
}
