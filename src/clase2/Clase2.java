package clase2;

// @author Fernando Racca
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Clase2 {
    
    public static int calcular(int unNumero, int otroNumero, IOperacion operacion) {
        return operacion.aplicar(unNumero, otroNumero);
    }

    public static void main(String[] args) {

        ISuma lambdaSuma = (unNumero, otroNumero) -> unNumero + otroNumero;

        int unNumero = 3;
        int otroNumero = 5;

        int resultadoSuma = lambdaSuma.sumar(unNumero, otroNumero);

        System.out.println(resultadoSuma);
        
        int suma = calcular(unNumero,otroNumero,(a,b) -> a + b );
        System.out.println("Suma: " + suma);
        
        int resta = calcular(unNumero, otroNumero, (a, b) -> a - b);
        System.out.println("Resta: " + resta);
        
        
        System.out.println("---Supplier---");
        Stream.generate(() -> new Random().nextInt()).limit(5).forEach(System.out::println);
        

        Supplier<Integer> generadorRandom = () -> new Random().nextInt();
        Integer aleatorio = generadorRandom.get();
        System.out.println(aleatorio);
        
        System.out.println("---Predicate---");
        
        List<Integer> numeros = Arrays.asList(10, 11, 12, 13, 14);
       
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        numeros.stream().filter(n -> n % 2 == 0).forEach(v -> System.out.println(v));

        
        Predicate<String> cadenaComienzaConS = (x) -> x.startsWith("S");
        cadenaComienzaConS.test("Sandra");
        
        
        System.out.println("---Consumer---");
        
        numeros.forEach(System.out::println);
        
        
        System.out.println("---Function---");
        
        numeros.stream().map(n -> n.doubleValue()).forEach(System.out::println);
        numeros.stream().map(n -> n * 2).forEach(System.out::println);
        
        
        System.out.println("*******************");       
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        System.out.println("*******************");       
        numeros.stream().forEach(System.out::println);
        
        
        
    }

    

}
