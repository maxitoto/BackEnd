

public abstract class Sintaxis {//la primer letra en mayuscula y el mismo nombre del archivo .java
     //declaro como clase abstracta para hacer un metodo abstracto que puede ser sobreescrito.

    @SuppressWarnings("unused")
    private int $variable1 = 1; //es conocida solo por esta clase y sus metodos.

    public  int _variable2 = 2;//es conocida por todas las clases de todos los lugares(packages, etc.).

    protected int _1_variable3 = 3;//es conocida por esta clase y las que sus clases hijas.

    
    public static int valor = 0;//es conocido por las instancias, llamado atributo de clase, su valor y referencia es compartida por todas las intancias, cada instancia NO crea su propia variable "valor", en otras palabras es unica.

    public final double gravedaddelatierra = 9.10;//es una constane, no puede cambiar su valor nunca y es posible que sea de clase "static".

    public static void metodoEstatico(){//se ejectua primero siempre y es conocido por las instancias/objetos de la misma clase.
        System.out.println("Soy publico y estatico, me ejecuto primero y soy conocido por las instancias.");
    }

    Otraclase otraclase;

    @SuppressWarnings("static-access")
    public Sintaxis(double otrovalor) {
        this.valor += 1;
        metodoEstatico();
        System.out.println("Print valor = " + this.valor);
        this.otraclase = new Otraclase();   
    }

    public void hacerAlgo(){
        System.out.println("Soy publico");
    }

    @SuppressWarnings("unused")
    private void hacerAlgo(int value){//sobrecarga de metodos, mismo nombre y retorno diferente argumento.
        System.out.println("Soy privado y tengo "+value);
    }

    protected void hacerAlgo(boolean value){//sobrecarga de metodos, mismo nombre y retorno diferente argumento.
        System.out.println("Soy protegido y tengo "+value);
    }

    public String sobreEscritura(){//este metodo tiene cuerpo y sera sobre escrito por otro metodo en otra clase usando la etiqueta @Override .
        return "Texto Original";
    }


    class Otraclase{//su declaracion no requiere del uso de public y toda clase primer letra en mayuscula

        @SuppressWarnings("unused")
        private int $variable1 = 20; //puedo declarar otra variable con el mismo nombre y tipo.

        @SuppressWarnings("unused")
        private int variable4 = 21;

        public int variable5 = 22;

        protected int variable6 = 23;

        public Otraclase(){
            System.out.println("crear clase interna");
        }

        public void metodoDeClaseInterna(){
            System.out.println("Soy el metodo de la clase dentro de otra clase");
        }

        
        //public interface claseInterface{} esto no se puede, hay un limite de clases dentro de otra clase.

    }


    
    public interface OtraClaseMas {
        public int dato1 = 1;
        public final int dato2 = 2;
        public static int dato3 = 3;
        public static final int dato4 = 123;
        public abstract void polimorfismo();
    
    }


}