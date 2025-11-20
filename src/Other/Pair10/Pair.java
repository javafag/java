package Other.Pair10;

import java.util.ArrayList;
import java.util.List;

public class Pair <T> {

    private T first;
    private T second;


    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }


    public static <T> void printAll(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
        System.out.println();
    }


    public void printPair() {
        printAll(new ArrayList<>(List.of(first, second)));
    }


    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {

        Pair<Integer> numb = new Pair<>();

        Pair<String> line = new Pair<>();

        numb.setFirst(1);
        numb.setSecond(5);

        line.setFirst("first line");
        line.setSecond("second line");


        numb.printPair();
        line.printPair();





    }
}


//Задание 1 — базовый <T>
//
//ТЗ:
//Создай класс Pair<T> с двумя полями first и second.
//
//Сделай методы getFirst(), getSecond(), setFirst(), setSecond().
//
//Проверь, что можно создать Pair<Integer> и Pair<String> и вывести значения.
