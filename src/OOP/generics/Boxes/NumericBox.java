package OOP.generics.Boxes;

class NumericBox<T extends Number> {
    private T number;

    public NumericBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    public double DoubleAnyBox() {
        return number.doubleValue() * 2;
    }

    public T getNumber() {
        return number;
    }

    public static double multiplyByTwo(NumericBox<? extends Number> box) {
        return box.getNumber().doubleValue() * 2;
    }

    public double add(NumericBox<? extends Number> other){
        return this.number.doubleValue() + other.getNumber().doubleValue();
    }



    public static void main(String[] args) {


        NumericBox<Integer> intBox = new NumericBox<>(10);
        NumericBox<Double> doubleBox = new NumericBox<>(5.5);


        System.out.println("intBox * 2 = " + multiplyByTwo(intBox)); // 20.0
        System.out.println("doubleBox * 2 = " + multiplyByTwo(doubleBox)); // 11.0






    }



}