package RepasoJava.PackagesCode;
import java.lang.Package;

/*
@author Tomas Blanco
*/


/** 
 * llamarAunPaquete 
 */
public class PruebasConPackages {   

    public static void main(String[] args) {        
        try {            
            // Obtener todos los paquetes conocidos por el ClassLoader
            Package[] packages = Package.getPackages();
            
            // Imprimir información sobre cada paquete
            for (Package p : packages) {
                System.out.println("Paquete: " + p.getName());
                System.out.println("  Spec Title: " + p.getSpecificationTitle());
                System.out.println("  Spec Version: " + p.getSpecificationVersion());
                System.out.println("  Spec Vendor: " + p.getSpecificationVendor());
                System.out.println("  Impl Title: " + p.getImplementationTitle());
                System.out.println("  Impl Version: " + p.getImplementationVersion());
                System.out.println("  Impl Vendor: " + p.getImplementationVendor());
                System.out.println();
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }    
    }
}
