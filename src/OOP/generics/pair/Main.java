package OOP.generics.pair;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }
}


public class Main {
    public static double sum(Pair<? extends Number, ? extends Number> pair) {
        return pair.getFirst().doubleValue() + pair.getSecond().doubleValue();
    }

    public static void main(String[] args) {
        Pair<Integer, Double> p = new Pair<>(10, 20.5);
        System.out.println(sum(p)); // 30.5
    }
}






//🧩 Маленькое задание
//
//Создай класс Pair, который хранит два значения (любых типов).
//А затем сделай метод, который принимает Pair<? extends Number, ? extends Number>
//и возвращает сумму этих двух чисел как double.

