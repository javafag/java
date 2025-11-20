package OOP.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//🧩 Задания Уровня 2
//
//Перебор списка
//
//Используй forEach() с лямбдой, чтобы вывести все элементы списка в верхнем регистре.
//
//Фильтрация чисел
//
//С помощью filter() выведи только нечётные числа из списка List<Integer>.
//
//Сортировка строк по длине
//
//Отсортируй список слов по длине с помощью Collections.sort() и лямбды.
//🟠 Уровень 3 — Задание 3
//
//Подсчёт слов с буквой ‘a’.
//
//List<String> words = Arrays.asList("Java", "Lambda", "Stream", "Map", "Code");
//
//// твой код здесь
//
//
//🎯 Используй .stream().filter(...).count()
//и выведи количество слов, где есть буква 'a' (неважно, заглавная или нет).

public class LambdaCollectionDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Olek","Danil","Alex");

        System.out.println("Names in upper case: ");
        names.forEach(name -> System.out.println(name.toUpperCase()));


        List<Integer> nums = Arrays.asList(1,2,3);

        System.out.println("Numbers which isEven");
        nums.stream()
                .filter(n -> n % 2 != 0)
                .forEach( System.out::println);

        List<String> words = Arrays.asList("Night","Day","Midday");

        words.sort((a,b) -> a.length() - b.length());

        System.out.println("Words sorted by length");

        words.forEach(System.out::println);


        List<String> words1 = Arrays.asList("Night","Day","Midday");

        System.out.println(words1.stream()
                .filter(n -> n.toLowerCase().contains("a"))
                .count());


    }
}
