package Advanced;

//Задача: "Фильтруем и модифицируем имена"
//Есть список имён:
//List<String> names = List.of("Tom", "Alice", "Bob", "Catherine", "Dan");
//
//        Используй Predicate, чтобы оставить только имена, которые начинаются с буквы 'A' или 'C'.
//
//        Используй Function, чтобы заменить каждое имя на количество букв + количество гласных (a, e, i, o, u).
//
//        Используй Supplier, чтобы добавить случайное число от 1 до 5 к каждому результату.
//
//        Используй Consumer, чтобы вывести результат в формате:
//
//Name score: <число>

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class prove2 {

    public static Predicate<String> nameFilt = n -> n.startsWith("A") || n.startsWith("C");
    public static Function<String,Integer> nameFilt2 = name ->{
        int length = name.length(); // количество букв
        int vowels = 0;

        for(char c : name.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) >= 0){
                vowels++;
            }
        }
        return length + vowels;
    };
    public static Supplier<Integer> randomNum = () -> 1 + (int) (Math.random() * 5);
    public static Consumer<Integer> RES = n -> System.out.println("Name score: " + n);


    public static void main(String[] args) {
        List<String> names = List.of("Tom", "Alice", "Bob", "Catherine", "Dan");

        names.stream()
                .filter(nameFilt)
                .map(nameFilt2)
                .map(l -> l + randomNum.get())
                .forEach(RES);

    }
}
