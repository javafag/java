package OOP.lamdas;

//🧩 Задание
//
//Создай интерфейс:
//

//}
//
//
//В main() создай несколько лямбд, которые реализуют этот интерфейс:
//
//превращают строку в верхний регистр;
//
//добавляют восклицательный знак;
//
//переворачивают строку задом наперёд.
//
//        Вызови .modify() для каждой лямбды и выведи результат.



public class Lamdb {


    @FunctionalInterface
    interface StringModifier {
        String modify(String s);
    }

    public static void main(String[] args) {
        StringModifier upper = s -> s.toUpperCase();
        StringModifier excited = s -> s + "!";
        StringModifier backward = s -> new StringBuilder(s).reverse().toString();

        System.out.println(upper.modify("lambda"));
        System.out.println(excited.modify("stream"));
        System.out.println(backward.modify("java"));
    }
}

