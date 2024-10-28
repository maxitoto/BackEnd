package RepasoJava.Anotaciones;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PruebaAnotacionPersonal {
    public static void main(String[] args) {
        CrearAnotaciones claseConAnotaciones = new CrearAnotaciones();

        //verificamos si la clase esta anotada como importante
        System.out.println("La clase es muy importante? "+(claseConAnotaciones.getClass().isAnnotationPresent(MuyImportante.class)?"Si": "No" ));
        
        System.out.println("La clase no es importante? "+(claseConAnotaciones.getClass().isAnnotationPresent(NoEsImportante.class)?"Si": "No" ));

        //podemos buscar los metodos que tengan x anotacion y ,por ejemplo, ejecutarlos primero
        for(Method method : claseConAnotaciones.getClass().getMethods()){
            System.out.println("El metodo "+method.getName()+" es importante? "+(method.isAnnotationPresent(MuyImportante.class)?"Si": "No") );

            if(method.isAnnotationPresent(MuyImportante.class)){
                try {
                    method.invoke(claseConAnotaciones, args);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

            
        }


    }
}
