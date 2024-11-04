
public class HerenciaYpolismorfismo extends Sintaxis implements Sintaxis.OtraClaseMas{
    
    @SuppressWarnings("static-access")
    public HerenciaYpolismorfismo(){
        super(1.2);
        System.out.println("var3 Sinstaxis "+super._1_variable3);
        System.out.println("var2 Sinstaxis "+super._variable2);
        System.out.println("const Sinstaxis "+super.gravedaddelatierra);
        System.out.println("valor sintatixs "+super.valor);
        super.otraclase.metodoDeClaseInterna();
    }

    @Override
    public String sobreEscritura(){
        return "Soy el texto original";
    }

    @Override
    public void polimorfismo(){
        System.out.println("Nuevo cuerpo, soy de HerenciaYpolimorfismo");
    }

    public static void main(String[] args) {
        HerenciaYpolismorfismo hyp = new HerenciaYpolismorfismo();
        hyp.hacerAlgo(false);
        hyp.sobreEscritura();
        hyp.hacerAlgo();
        hyp.polimorfismo();
    }
}

