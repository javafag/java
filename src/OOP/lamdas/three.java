package OOP.lamdas;


import java.util.List;
import java.util.stream.*;
//🧩 Задания уровня 3
//        1️⃣ Квадраты чётных чисел
//
//Задание:
//Из списка 1..10 вывести квадраты только чётных чисел.

//  🟠 Уровень 3 — Задание 2
//
//          Найди самое длинное слово в списке.
//
//          List<String> words = Arrays.asList("Java", "Lambda", "Stream", "Function", "Map");
//
//// твой код здесь
//
//
//          🎯 Используй .stream().max(...) с лямбдой.


import java.util.Arrays;



public class three  {



    public static void main(String[] args) {
        Integer Nums [] = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(Nums)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);




        List<String> words = Arrays.asList("Java", "Lambda", "Stream", "Function", "Map");
        words.stream()
                .max((a , b) -> a.length() - b.length())
                .ifPresent(System.out::println);


    }



}
