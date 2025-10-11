package OOP.Queue;

import java.util.ArrayDeque;

public class LeftRight {



    public static void main(String[] args) {

        ArrayDeque<String> sites = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        sites.addLast("Cock1.com");
        sites.addLast("Cock2.com");
        sites.addLast("Cock3.com");
        sites.addLast("Cock4.com");
        sites.addLast("Cock5.com");

       //back
        String last = sites.removeLast();
        forwardStack.addLast(last);
        System.out.println("Возврат: " + last);

        //back
        last = sites.removeLast();
        forwardStack.addLast(last);
        System.out.println("Возврат: " + last);


        // forward:
        String site = forwardStack.removeLast();
        sites.addLast(site);

        System.out.println("Вперед: " + site);



        System.out.println(sites);

    }



}


//🎯 ТЗ: “Браузер с вперёд/назад”
//
//Сделай программу с двусторонней историей сайтов:
//
//Используй ArrayDeque<String> для хранения истории.
//
//Добавляй сайты в конец очереди (addLast()) — это новые посещённые сайты.
//
//Реализуй две команды:
//
//back — возвращаемся назад (removeLast()), выводим: "Возврат: <сайт>"
//
//forward — возвращаемся вперёд (addLast() из временной “корзины”), выводим: "Вперёд: <сайт>"
//
//Добавь 5 сайтов и сделай:
//
//        2 раза back
//
//1 раз forward (повторное посещение одного из удалённых сайтов)
//
//В конце выведи оставшиеся сайты в истории.