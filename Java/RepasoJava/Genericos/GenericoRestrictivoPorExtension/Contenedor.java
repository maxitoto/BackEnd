package RepasoJava.Genericos.GenericoRestrictivoPorExtension;


//por nomenclatura se coloca T de Type
public class Contenedor<T extends Number> {

    private T value;
    
    public String mostrar(){
        return this.value.getClass().getName();
    }
    public void addContent(T value){
        this.value=value;
    }
}


class Diccionario<K extends Number, T>{
    private T value;
    private K key;

    public Diccionario(K key, T value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{"+this.key+":"+this.value+"}";
    }
}

class Mapa<K extends Number, T extends Object>{

    private static Long cont_element = 0l;

    @SuppressWarnings("rawtypes")
    private static java.util.List<Diccionario> map = new java.util.ArrayList<Diccionario>();

    @SuppressWarnings({ "unchecked", "static-access" })
    public void addMapping(T object){
        Diccionario<Number, T> objectMap = new Diccionario<Number,T>(cont_element, object);

        while((cont_element!=0) && (getDiccByKey((K) ((Number)cont_element.doubleValue()))!=null)){
            cont_element++;
        }

        this.map.add(objectMap);
        cont_element++;
        this.map.sort((o1, o2) -> {
            if(o1.getKey().doubleValue()>o2.getKey().doubleValue()){
                return 1;
            }
            if(o1.getKey().doubleValue()<o2.getKey().doubleValue()){
                return -1;
            }
            return 0;
        });
    }

    @SuppressWarnings("static-access")
    public void addMapping(K key, T object){
        @SuppressWarnings("rawtypes")
        Diccionario dir = map.stream().filter(diccionario -> {
            // Compara usando doubleValue() o intValue() según sea necesario
            if (key instanceof Double) {
                return diccionario.getKey().doubleValue() == ((Double) key).doubleValue();
            } else if (key instanceof Integer) {
                return diccionario.getKey().intValue() == ((Integer) key).intValue();
            } else if (key instanceof Long) {
                return diccionario.getKey().longValue() == ((Long) key).longValue();
            }
            return false; // Si el tipo no coincide, retorna false
        }).findFirst().orElse(null);

        if(dir==null){
            Diccionario<Number, T> objectMap = new Diccionario<Number,T>(key, object);
            this.map.add(objectMap);
            this.map.sort((o1, o2) -> {
                if(o1.getKey().doubleValue()>o2.getKey().doubleValue()){
                    return 1;
                }
                if(o1.getKey().doubleValue()<o2.getKey().doubleValue()){
                    return -1;
                }
                return 0;
            });
        }else{ System.err.println("la key esta ocupada");}
    }
    
    @SuppressWarnings("rawtypes")
    public Diccionario getDiccByKey(K key) {
        return map.stream()
                  .filter(diccionario -> {
                      // Compara usando doubleValue() o intValue() según sea necesario
                      if (key instanceof Double) {
                          return diccionario.getKey().doubleValue() == ((Double) key).doubleValue();
                      } else if (key instanceof Integer) {
                          return diccionario.getKey().intValue() == ((Integer) key).intValue();
                      } else if (key instanceof Long) {
                          return diccionario.getKey().longValue() == ((Long) key).longValue();
                      }
                      return false; // Si el tipo no coincide, retorna false
                  })
                  .findFirst()
                  .orElse(null); // Retorna null si no se encuentra
    }


    public String mostarDiccionario(){
        return map.stream().map(Diccionario::toString)
        .collect(java.util.stream.Collectors.joining(", "));
    }
}

class mente{
    public static void main(String[] args) {
        Contenedor<Number> contenedor = new Contenedor<Number>();

        int A = 5;
        Integer B = 5;

        contenedor.addContent(A);
        System.out.println(contenedor.mostrar());
        contenedor.addContent(B);
        System.out.println(contenedor.mostrar());


        //mi mapa
        Mapa<Number, Object> map = new Mapa<Number, Object>();
        
        Integer element0 = 523;
        String element1 = "Soy tomas";
        double element2 = 15.2321;

        map.addMapping(element0);
        map.addMapping(element1);
        map.addMapping(element2);

        System.out.println(map.getDiccByKey(1l));

        System.out.println(map.mostarDiccionario());
     

        String element3 = "Prueba de key rara";

        map.addMapping(1.5, element3);

        System.out.println(map.getDiccByKey(1.5));

        System.out.println(map.mostarDiccionario());

        
    }
}