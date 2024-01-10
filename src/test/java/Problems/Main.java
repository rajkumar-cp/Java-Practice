import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Kumar");

        //Consumer
        Consumer<String> printNames = name -> System.out.println(name);
        names.forEach(printNames);

        //Function
        Function<Integer,Integer> fun = n -> n*n;
        System.out.println(fun.apply(25));

        //Predicate
        IntPredicate predicate = n -> n%2 == 0;
        System.out.println(predicate.test(25));

        //Supplier
        Supplier<Double> sup = () -> Math.random()*100;
        System.out.println(sup);

        //Streams
        Stream<String> stream = Stream.of("Siva","Subbu");
        stream.forEach(System.out::println);

        String name = "Rajkumar";
        System.out.println(name.charAt(-1));
    }
}
