package RepasoJava.Condicionales;

import java.util.Random;

public class SwitchSintaxisDiferente {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(2);

        //otra forma nueva
        switch(num){
            case 0 -> System.out.println("Salio: "+num);
            case 1 -> System.out.println("Salio: "+num);
            default -> System.out.println("Salio: "+num);
        }

        //otra forma
        switch(num){
            case 0,1,2,3,4,5 -> System.out.println("Salio: "+num);
            case 6,7,8,9,10 -> System.out.println("Salio: "+num);
            default -> System.out.println("Salio: "+num);
        }

        //otra forma Switch dentro de switch (definitivamente mala practica)
        switch(num){
            case 0,1,2,3,4,5 -> System.out.println("Salio: "+num);
            case 6,7,8,9,10 ->{
                switch (r) {
                    case null -> System.out.println("R es null y es un switch dentro de un switch");
                    default -> System.out.println("R No es null y es un switch dentro de un switch");
                }
            }
            default -> System.out.println("Salio: "+num);
        }

        //switch vieja
        switch (num){
            case 0:
            System.out.println("Salio: "+num);
                break;
            
            case 1:
            System.out.println("Salio: "+num);
                break;
            
            default:
            System.out.println("Salio: "+num);
                break;
            
        }


        //switch expression
        String a = switchExpresion(1);
        
    }

    public static String switchExpresion(int elem){
        int resto = elem  % 2;
        return switch(resto){
            case 0 -> "Es par";
            default -> "Es impar";
        }; //recordar colocar un ";" porque no es un switch normal, en realidad es un return;
    }

}
