package OOP.Queue;
import java.util.ArrayDeque;

public class Actions {
    public static void main(String[] args) {
        ArrayDeque<String> sites = new ArrayDeque<>();

        sites.addFirst("google.com");
        sites.addFirst("github.com");
        sites.addFirst("youtube.com");
        sites.addFirst("pornhub.com");

        System.out.println(sites);



        sites.removeLast();
        sites.removeLast();


        System.out.println(sites);



    }
}


//🧩 ТЗ: “История браузера”
//
//Сделай программу, которая:
//
//Использует ArrayDeque<String> для хранения посещённых сайтов.
//
//Добавь 4–5 сайтов (google.com, youtube.com, github.com, и т.д.).
//
//Выведи все посещённые сайты.
//
//Затем “вернись назад” два раза — удали последние 2 сайта (removeLast()),
//и выведи сообщение типа:
//
//Возврат: github.com
//Возврат: youtube.com
//
//
//После этого покажи, какие сайты остались в истории.