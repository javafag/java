package OOP.generics.pr;


import java.util.ArrayList;
import java.util.List;

public class NumericBoxManager {
    public static void main(String[] args) {

        NumericBox<Integer> intBox = new NumericBox<>(25);

        NumericBox<Double> doubleBox = new NumericBox<>(25.0);

        NumericBox<Float> floatBox = new NumericBox<>(23.2f);





        List<Integer> list = new ArrayList<>();


        BoxUtils.fillIntegers(list);
        BoxUtils.printAll(list);

        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        System.out.println(BoxUtils.sumAll(doubles));
        System.out.println(BoxUtils.multiply(2, 3.5));


    }
}

//🧩 Шаг 3. Мини-проект "NumericBoxManager"
//
//        ⚙️ ТЗ:
//
//Создай класс NumericBox<T extends Number>
//
//Метод double sum(NumericBox<? extends Number> other)
//
//Метод boolean isGreaterThan(NumericBox<? extends Number> other)
//
//Статический метод printAll(List<? extends Number> list)
//
//В main() продемонстрировать работу с Integer, Double, Float"