package Ejercicios.A;

//buscar de forma imperativa el primer caracter repetido de un texto, sino hay elementos repetidos devolver "_"

import java.util.HashSet;

public class Mente {
    public static void main(String[] args) {
        String txt = "abcdd";
        char[] vectorChar = txt.toLowerCase().toCharArray();
        HashSet<String> mapset = new HashSet<String>();
        String resultado = "_";

        int i = 0;
        while(i<txt.length() && resultado=="_"){
            if(!mapset.add(vectorChar[i]+"")){
                resultado = vectorChar[i]+"";
                continue;
            }
            i++;
        }


        System.out.println("Resultado:" + resultado);
        System.out.println(mapset);

    }
}
