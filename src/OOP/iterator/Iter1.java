package OOP.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter1 {

    public static void main(String[] args) {

        ArrayList<String> Listik = new ArrayList<>();

        Listik.add("Gigle1");
        Listik.add("Gigle2");
        Listik.add("Gigle3");
        Listik.add("Gigle4");



        Iterator<String> it = Listik.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name.toUpperCase());
        }
    }
}


//🧩 Задание 1. Простой обход с Iterator (ArrayList)

//Цель: научиться использовать Iterator для последовательного чтения элементов.
//📋 Условие

//Создай ArrayList<String> из нескольких имён.
//С помощью Iterator выведи все элементы в верхнем регистре (UPPERCASE).
//Не используй for-each.