package OOP.lamdas;

//Требуется, используя только Stream API и лямбда-выражения, выполнить следующие действия:
//
//Оставить только слова, начинающиеся на букву 'a'.
//
//Убрать дубликаты.
//
//Преобразовать каждое слово в верхний регистр.
//
//Отсортировать слова по длине, а при равной длине — по алфавиту.
//
//Собрать результат в список и вывести на экран.


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Lambda1 {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "apricot", "orange", "avocado", "blueberry", "pear", "apple");

        System.out.println("Вывод тех что содержат а");
        words.stream()
                .filter(l -> l.contains("a") )
                .forEach(System.out::println);


        System.out.println("Вывод в верхнем регистре");
       words.stream()
               .forEach(string -> System.out.println(string.toUpperCase()));


       System.out.println("Вывод по размеруб, по алфавиту хз как добавить");
       words.stream()
                .max((a , b) -> a.length() - b.length())
                .ifPresent(System.out::println);


        System.out.println("Вывод без дубликатов");
       words.stream()
               .distinct()
               .forEach(System.out::println);


        System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("мое сверху, упорядоченное снизу");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");


        List<String> words1 = List.of(
                "apple", "banana", "apricot", "orange",
                "avocado", "blueberry", "pear", "apple"
        );

        List<String> result = words1.stream()
                .filter(w -> w.startsWith("a")) // 1. только слова на 'a'
                .distinct() // 2. убрать дубликаты
                .map(String::toUpperCase) // 3. преобразовать в верхний регистр
                .sorted(Comparator
                        .comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder())) // 4. сортировка
                .collect(Collectors.toList()); // 5. собрать в список

        System.out.println(result);


    }
}
