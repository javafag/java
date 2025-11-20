package Other;

import java.util.ArrayList;

public class srt {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("12345");

        sb.reverse();

        System.out.println(sb);

        sb.replace(1,4,"Xuy");

        System.out.println(sb);


        sb.deleteCharAt(0); // удалить первый символ
        sb.deleteCharAt(sb.length() - 1);


        System.out.println(sb);


        var xuy = new ArrayList<String>();

        xuy.add("penis");

        for(var i : xuy){
            System.out.println(i);
        }
    }
}


//Требования:
//
//Используй StringBuilder для переворачивания каждого числа.
//
//Не используй методы вроде split() и готовые библиотеки для переворота.
//
//Обработай произвольное количество чисел и пробелов.