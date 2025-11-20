package OOP.generics.Boxes2;

public class Boxes2 <T extends Number>  {

    private T num;


    public Boxes2(T num) {
        this.num = num;

    }

    public T get() {
        return num;
    }


    public void set(T value) {
        this.num = value;
    }


    public static void main(String[] args) {
        Boxes2<? extends Number> box1 = new Boxes2<>(10);
        Boxes2<? extends Number> box2 = new Boxes2<>(12.5);

        Boxes2<Number> box3 = new Boxes2<>(0);

        box3.set(235 );

        System.out.println(box3.get());

        System.out.println(box1.get());

        double sum = box1.get().doubleValue() + box2.get().doubleValue();
        System.out.println("Сумма: " + sum);


    }
}




//6️⃣ Практика
//
//Создай Box<?> с любым типом и выведи .get()
//
//Создай Box<? extends Number> и сложи два значения
//
//Создай Box<? super Integer> и запиши в него число