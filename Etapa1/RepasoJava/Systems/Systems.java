package RepasoJava.Systems;

public class Systems {
    public static void main(String[] args) {
        try {
            int a = 10; int b = 0;
            double result = Math.divideExact(a, b);
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
        }
        
        try {
            double result = 10/0;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: División por cero.");
        }

    }
}
