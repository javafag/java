package OOP.linkedlist;

import java.util.LinkedList;



public class MyList {


    public static void main(String[] args) {
        LinkedList<String> listik = new LinkedList<>();

        listik.add("Java");
        listik.add("Python");
        listik.add("Ruby");
        listik.add("C++");
        listik.add("Js");


        System.out.println("Initial Listik: " + listik);

        listik.remove(2);
        System.out.println("Updated Listik: " + listik);

        System.out.println(listik.getFirst() + "\n" + listik.getLast());
    }
}

//
//🔹 Задача 1 (простая)
//
//Условие:
//Создать LinkedList строк, добавить 5 названий языков программирования, удалить третий элемент, а затем вывести первый и последний элемент списка.
//
//Что отрабатываем:
//
//add() / addFirst() / addLast()
//
//remove(int index)
//
//getFirst() / getLast()
//
//Печать списка
//
//Решение: