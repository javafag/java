package OOP.ListIetr;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIter1 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");


        ListIterator<String> it = letters.listIterator();
        while (it.hasNext()){
            String value = it.next();
            if(value.equals("B"))
                it.set("BB");

        }


        it = letters.listIterator(); // возвращаем итератор в начало
        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("A")) {
                it.add("A+"); // вставка после "A"
            }
        }

//        System.out.println("Обход списка в обратном порядке:");
//        while (it.hasPrevious()) {
//            System.out.println(it.previous());
//        }



        System.out.println("Итоговый список: " + letters);
    }
}


//🔹 Задание: ListIterator
//📋 Условие
//
//Создай ArrayList<String> с элементами:
//
//        ["A", "B", "C", "D"]
//
//
//С помощью ListIterator:
//
//Пройди список вперед и замени "B" на "BB".
//
//Пройди список вперед и вставь "X" после "C".
//
//Пройди список назад и выведи все элементы на экран.
//
//🔹 Подсказка
//
//Для замены используем set()
//
//Для вставки — add()
//
//Для обратного обхода — hasPrevious() / previous()