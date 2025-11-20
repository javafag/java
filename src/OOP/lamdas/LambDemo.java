package OOP.lamdas;


//🟢 Уровень 1 — Базовые лямбды
//
//Квадрат числа
//        Создай лямбду, которая принимает число x и возвращает x * x.
//Вызови её для нескольких чисел и выведи результаты.
//
//Проверка чётности
//        Напиши лямбду, которая принимает int и возвращает true, если число чётное.
//
//Сложение двух чисел
//Лямбда с двумя аргументами (a, b) -> a + b.
//Выведи результат для нескольких пар чисел.

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambDemo {


    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(6));
        System.out.println(square.apply(8));

        Predicate<Integer> checker = x -> x % 2 == 0;

        System.out.println(checker.test(5));
        System.out.println(checker.test(7));

        BiFunction<Integer,Integer,Integer> dobleChecker = (x,y) -> x*y;

        System.out.println(dobleChecker.apply(2,4));




    }
}
