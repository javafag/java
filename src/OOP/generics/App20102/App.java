package OOP.generics.App20102;


//    🧩 Задача: "Копирование и суммирование"
//
//Нужно реализовать два метода:
//
//copy — копирует содержимое из одного списка в другой, используя дженерики (с extends и super).
//
//sumNumbers — считает сумму всех элементов списка чисел, используя ? extends Number.
//
//🎯 Условия:
//
//Метод copy должен принимать:
//
//источник (src), который может быть списком любого подтипа Number (например, List<Integer>, List<Double>),
//
//и приёмник (dest), который может быть любым списком, способным принимать объекты типа Number.
//
//Подсказка: Producer extends, Consumer super.
//
//Метод sumNumbers должен вернуть double — сумму всех чисел из списка любого числового типа (Integer, Double, Float, и т.д.).


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App  {




    public static void copy(List<? extends Number> one,List<? super Number> two){
        for(Number n : one){
            two.add(n);
        }
    }

    public static double sumNumbers(List<? extends Number> anyNumbers ) {

        double sum = 0.0;

        for (Number n : anyNumbers){
            sum+= n.doubleValue();
        }

        return  sum;
    }


    public static void main(String[] args) {


        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        List<Number> numbers = new ArrayList<>();



        copy(ints,numbers);

        System.out.println(numbers);

        System.out.println(sumNumbers(numbers));
    }
}
