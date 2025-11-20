package OOP.generics.Pair2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> pair1 = Utils.createPair("Возраст",25);
        Pair<String,String> pair2 = Utils.createPair("Имя","Anna");
        Pair<Integer,String> pair3 = Utils.createPair(100,"OK");

        System.out.println("Пара 1: " + pair1);
        System.out.println("Пара 2: " + pair2);
        System.out.println("Пара 3: " + pair3);


        Pair<String,String> pair2SW = pair2.swap();
        System.out.println("SWAPPED PAIR: " + pair2SW);




        boolean keysEqual = Utils.areKeysEqual(pair1, pair2);
        System.out.println("Ключи равны: " + keysEqual);



        String[] stringArray = {"один", "два", "три"};
        Integer[] intArray = {10, 20, 30};
        Double[] doubleArray = {1.5, 2.5, 3.5};

        System.out.print("Массив String: ");
        Utils.printArray(stringArray);

        System.out.print("Массив Integer: ");
        Utils.printArray(intArray);

        System.out.print("Массив Double: ");
        Utils.printArray(doubleArray);

    }
}


//### В main():
//        1. Создай 3 пары разных типов через `Util.createPair()`
//        2. Выведи их
//3. Используй `swap()` на одной из пар
//4. Сравни ключи двух пар через `areKeysEqual()`
//        5. Создай массивы String, Integer, Double и выведи через `printArray()`
//
//        **Пример вывода:**
//        ```
//Пара 1: Pair{key=имя, value=Анна}
//Пара 2: Pair{key=возраст, value=25}
//Пара 3: Pair{key=100, value=OK}
//
//После swap: Pair{key=Анна, value=имя}
//
//Ключи равны: false
//
//Массив String: [один, два, три]
//Массив Integer: [10, 20, 30]
//Массив Double: [1.5, 2.5, 3.5]