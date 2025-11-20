package OOP.generics.pr2;

import java.util.List;

public class AdvancedBoxUtils {
    public static <T> void printAll(List<T> list){
        for(T listik : list){
            System.out.println(listik);
        }
        System.out.println();
    }

    public static double sumAll(List<? extends Number> list){
        double sum = 0;

        for(Number listik : list){
            sum += listik.doubleValue();
        }
        return sum;
    }

    public static void fillInts(List<? super Integer> list){
        list.add(90);
        list.add(60);
        list.add(30);
    }

    public static <T extends Number & Comparable<T>> T findMax(List<T> list){
        if (list == null || list.isEmpty()) return null;

        T max = list.get(0);
        for (T item : list) {
            // compareTo вернёт:
            // >0 если max < item
            // 0  если равны
            // <0 если max > item
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}


//2️⃣ Утилитарный класс AdvancedBoxUtils
//
//Методы:
//
//static <T> void printAll(List<T> list) — вывод любого списка
//
//static double sumAll(List<? extends Number> list) — сумма всех элементов
//
//static void fillIntegers(List<? super Integer> list) — записывает три числа (например, 10, 20, 30)
//
//static <T extends Number & Comparable<T>> T findMax(List<T> list) — возвращает максимальный элемент
//
