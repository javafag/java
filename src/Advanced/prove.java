package Advanced;

//Задача
//
//Есть список строк: ["Hi", "Hello", "Java", "Stream"]
//
//Используем Predicate для фильтрации строк длиннее 3 символов
//
//Применяем Function для вычисления длины каждой строки
//
//Выводим результат с помощью Consumer
//
//Используем Supplier для генерации случайного числа и добавляем его к каждой длине

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class prove {

    public static Predicate<String> lengthControl = l -> l.length() > 3;
    public static Function<String,Integer> lengthCheck = l -> l.length();
    public static Consumer<Integer> printer = r -> System.out.println("result " + r);
    public static Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 10);


    public static void main(String[] args) {
        List<String> list = List.of("Hi","Hello","Java","Stream");

        list.stream()
                .filter(lengthControl)
                .map(lengthCheck)
                .map(length -> length + randomSupplier.get())
                .forEach(printer);

    }
}
