package Other.MathBox;


import java.util.ArrayList;
import java.util.List;



public class MathBox <T extends Number>{

    private T num;

    public MathBox(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }


    public static <T extends Number> double sumAll(List<? extends MathBox<? extends Number>> boxes) {
        double total = 0;
        for (MathBox<? extends Number> box : boxes) {
            total += box.getNum().doubleValue();
        }
        return total;
    }


    @Override
    public String toString() {
        return "MathBox{" +
                "num=" + num +
                '}';
    }



    public static void main(String[] args) {

        MathBox<Integer> intik = new MathBox<>(5);

        MathBox<Double> doublik = new MathBox<>(5.0);

        MathBox<Double> doublik2 = new MathBox<>(7.0);

        List<MathBox<? extends Number>> boxes = new ArrayList<>();
        boxes.add(intik);
        boxes.add(doublik);
        boxes.add(doublik2);

        // суммируем все элементы через sumAll
        double total = MathBox.sumAll(boxes);
        System.out.println("Сумма всех элементов: " + total);





    }
}


//Задание 2 — bounded type <T extends Number>
//
//ТЗ:
//Создай класс MathBox<T extends Number> с методом sum(), который возвращает сумму всех чисел.
//
//Попробуй использовать MathBox<Integer> и MathBox<Double>.
//
//        Проверь, что MathBox<String> не компилируется.
