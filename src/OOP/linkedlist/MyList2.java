package OOP.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;


public class MyList2 {


    public static void main(String[] args) {
        LinkedList<Integer> listik = new LinkedList<>();

        listik.add(1); listik.add(2); listik.add(3); listik.add(4); listik.add(5);

        System.out.println("Initial list: " + listik);

        LinkedList<Integer> evens = new LinkedList<>();
        Iterator<Integer> it = listik.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
                evens.add(num);
            }
        }

        listik.addAll(evens);

        System.out.println("Updated list: " + listik);

    }
}


//🔹 Задача 2 (сложнее)
//
//Условие:
//Создать LinkedList чисел. Написать метод, который перемещает все чётные числа в конец списка, сохраняя порядок остальных элементов.
//
//Что отрабатываем:
//
//Перебор списка (for / Iterator)
//
//Удаление и добавление элементов (remove(), addLast())
//
//Работа с условием (чётные/нечётные)
