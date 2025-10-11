package OOP.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iter2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer num = it.next();
                if(num % 2 == 0) {
                    it.remove();
                }
        }

        System.out.println("После удаления чётных: " + numbers);

    }
}


//🔹 Задание 2: Удаление чётных чисел из ArrayList
//📋 Условие
//
//Создай ArrayList<Integer> со значениями от 1 до 10.
//
//С помощью Iterator удали все чётные числа.
//
//Выведи список после удаления.