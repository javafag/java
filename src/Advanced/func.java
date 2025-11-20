package Advanced;

// Function
//
//Function<T, R>:
//        Принимает T, возвращает R
//Метод: R apply(T t)
//🔧 Задача
//
//Создать Function<String, Integer> под названием stringLength, которая возвращает длину строки.
//Попробуй написать код. После этого мы посмотрим, как его можно использовать в Stream.


//        Создай Consumer<String> под названием printer, который выводит строку в консоль с префиксом "Hello, ".
//
//        Например, для строки "Alice" должно выводиться:

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class func {

    public static Function<String,Integer> stringLength = s -> s.length();
    public static Consumer<String> printer = s -> System.out.println("Hello, " + s);
    public static Supplier<Double> randomSupplier = () -> Math.random();


    public static void main(String[] args) {

        System.out.println(randomSupplier.get());

        Stream
                .generate(randomSupplier)
                .limit(5)
                .forEach(System.out::println);



        String L = "el";

        int length = stringLength.apply(L);

        System.out.println(length);

        List<String> list = List.of("Hi","Hello");

        list.stream()
                .map(stringLength)
                .forEach(System.out::println);


        printer.accept("Alice");

        list.stream()
                .forEach(printer);



    }
}
