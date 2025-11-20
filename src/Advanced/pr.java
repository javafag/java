package Advanced;


//✔ Короткое напоминание
//
//Predicate<T> — принимает T, возвращает boolean
//Метод: boolean test(T t)
//
//🔧 Мини-задача №1
//
//Создай Predicate<Integer> который проверяет, является ли число положительным.
//
//Попробуй написать сам.
//А когда будешь готов — скажи "проверка", и я покажу правильный вариант.

import java.util.function.Predicate;



public class pr {


    public static Predicate<Integer> isEven = n -> n % 2 == 0;


    public static void main(String[] args) {

        System.out.println(isEven.test(15));


    }
}
