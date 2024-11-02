package RepasoJava.Genericos.GenericoRestrictivoPorExtension;



public class UsandoMiMapa {
    public static void main(String[] args) {
        Mapa<Integer,InnerPersona> mapa = new Mapa<Integer,InnerPersona>();

        mapa.addMapping(new InnerPersona("Tomas Blanco", 24));

        mapa.addMapping(new InnerPersona("Silvana Blanco", 54));

        mapa.addMapping(50,new InnerPersona("David Blanco", 32));

        mapa.addMapping(new InnerPersona("Leonardo Dicaprio", 58));

        System.out.println(mapa.mostarDiccionario());

    }
}
