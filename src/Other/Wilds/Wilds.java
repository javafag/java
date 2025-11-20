package Other.Wilds;

import java.util.ArrayList;
import java.util.List;

public class Wilds <T extends Number> {

    private T numb;

    public Wilds(T numb) {
        this.numb = numb;
    }

    public T getNumb() {
        return numb;
    }

    public void setNumb(T numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "Wilds{" +
                "numb=" + numb +
                '}';
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void AddInt(List<? super Integer> list){
        list.add(10);
        list.add(15);
        list.add(20);
    }


    public static void main(String[] args) {

        List<Number> numbers = new ArrayList<>();

        AddInt(numbers);

        printNumbers(numbers);

        List<Integer> ints = new ArrayList<>();

        AddInt(ints);

        printNumbers(ints);

        List<Double> doubles = new ArrayList<>();

        printNumbers(doubles);

    }
}


//Задание 3 — Wildcards
//
//Создай метод printNumbers, который принимает List<? extends Number> и выводит все числа.
//
//        Используем ? extends Number, потому что мы только читаем из списка.
//
//Создай метод addIntegers, который принимает List<? super Integer> и добавляет несколько чисел в список.
//
//        Используем ? super Integer, потому что мы записываем в список.
//
//В main сделай:
//
//List<Number> — передай в printNumbers и addIntegers.
//
//        List<Integer> — передай в оба метода.
//
//List<Double> — передай только в printNumbers.
