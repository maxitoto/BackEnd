package RepasoJava.Anotaciones.Retention;

public class Demostracion {
    public static void main(String[] args) {
        RetentionCLASS rc = new RetentionCLASS();
        RetentionRUNTIME rr = new RetentionRUNTIME();
        RetentionSOURCE rs = new RetentionSOURCE();
        NoRetention nr = new NoRetention();

        System.out.println("La clase usa CLASS? "+(rc.getClass().isAnnotationPresent(UsaCLASS.class)?"Si": "No" ));//si pero es omitido hasta antes de TiMECompilet

        System.out.println("La clase usa RUNTIME? "+(rr.getClass().isAnnotationPresent(UsaRUNTIME.class)?"Si": "No" ));//directamente no es omitido

        System.out.println("La clase usa SOUCE? "+(rs.getClass().isAnnotationPresent(UsaSOURCE.class)?"Si": "No" ));// si pero es omitido en TIMECompilet

        System.out.println("La clase no usa Retention? "+(nr.getClass().isAnnotationPresent(NoUsaRetention.class)?"Si": "No" ));//Funciona Como class o source omitiendo la etiqueta target


    }
}
