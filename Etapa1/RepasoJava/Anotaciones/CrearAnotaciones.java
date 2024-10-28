package RepasoJava.Anotaciones;
//de forma irónica se necesitan dos anotaciones para crear una anotación
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;


@Target(ElementType.TYPE)//objetivo o destino, permite indicar en que tipo de elemento Java es válida esta anotación, si no se coloca, entonces la etiqueta "NoEsImportante" prodra user usada en cualquier elemento Java (Clases,Metodos,Variables,etc)

@Retention(RetentionPolicy.RUNTIME)// si no coloco runtime entonces cuando pregunte si la clase etiquetada como importante, ¿es importante? será falso, siendo importante.
@interface NoEsImportante{/*puede contener metodos abstractos*/}

//tambien podemos colocar varios objetivos
@Target({ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MuyImportante{/*puede contener metodos abstractos*/}

@NoEsImportante //ElementType.TYPE
public class CrearAnotaciones {

    private String varOne;
    private int varSecond;

    public CrearAnotaciones(){
        varOne="Hello";
        varSecond=230;
    }

    public void methodOne(){System.out.println("method One");}


    //@NoEsImportante da error, porque es para los tipo "Clase"
    @MuyImportante //ElementType.METHOD
    public void nuclearButton(){

        @MuyImportante //ElementType.LOCAL_VARIABLE
        String activationCode = this.varOne+this.varSecond;

        if(activationCode.equals("Hello230")){
            System.out.println("Misiles Lanzados !!!");
        }
        
    }

    public static void main(String[] args) {
        
        //ejemplo de anotacione
        @SuppressWarnings("unused")//elimina las advertencias amarallias de variables no usadas
        Object x = new Object();

        
        
    }

    //ejemplo de anotacione
    @Override //es una anotacion que avisa al compilador que este metodo esta sobreescribiendo a otro metodo, esto puede omitirse pero puede generar ambigüedades y producir resultados inesperados, claro que java lo administrará y haciendo algunos pasos extra se percatará de que es una sobreescrituria.
    public String toString() {
        return super.toString();
    }
}
