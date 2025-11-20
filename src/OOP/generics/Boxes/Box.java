package OOP.generics.Boxes;

public class Box <T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" + value + "}";
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);

        Box<String> box1 = new Box<>("11");

        Box<Double> box2 = new Box<>(12.0);


        System.out.println(box);
        System.out.println(box1);
        System.out.println(box2);

        box.value = (2);

        System.out.println(box);
    }
}


//✅ Задание:
//
//✅ Задание:
//
//Создай NumericBox<Integer> и NumericBox<Double>.
//
//Попробуй создать NumericBox<String> — посмотри, что произойдёт.
//
//Сделай метод, который принимает NumericBox<? extends Number> и возвращает его значение, умноженное на 2.