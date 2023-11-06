
package clase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


//@author Fernando Racca
 
public class EjercicioClase2 {
    
    public static void main(String[] args) {
        List <String> listaStrings = Arrays.asList("hola mundo", "chau", "argentina programa", "java");
        List <String> listaStringsMayuscula = new ArrayList<>();
        
        System.out.println("Imprimo la lista mientras la convierto:");
        listaStrings.stream().map(St -> St.toUpperCase()).forEach(System.out::println);
        
        System.out.println("Guardo los Strings en una nueva lista e imprimo la lista nueva:");
        listaStrings.stream().map(s -> s.toUpperCase()).forEach(x -> listaStringsMayuscula.add(x));
        listaStringsMayuscula.stream().forEach(System.out::println);
        
        //SOLUCION DESPUES DE LA CLASE 3
        System.out.println("Guardo con collect:");
        List <String> listaStringMayuscula2 = listaStrings.stream().map(s -> s.toUpperCase())
                 .collect(Collectors.toList());
        listaStringMayuscula2.stream().forEach(System.out::println);
    }

}
