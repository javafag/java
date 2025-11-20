package OOP.generics.GenericCount;

public class GenericCont<T> {

    private T value;

    GenericCont(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isEmpty(){
        return value == null;
    }

    public void clear() {
        this.value = null;
    }


    public static void main(String[] args) {

        GenericCont<String> str = new GenericCont<>("Zalupka");

        System.out.println(str.getValue());

        System.out.println(str.isEmpty());

        str.clear();

        System.out.println(str.isEmpty());

        System.out.println("\n");

        GenericCont<Integer> num = new GenericCont<>(4);

        System.out.println(num.getValue());

        System.out.println(num.isEmpty());

        num.clear();

        System.out.println(num.isEmpty());

        System.out.println("\n");

        GenericCont<Double> num2 = new GenericCont<>(4.0);

        System.out.println(num2.getValue());

        System.out.println(num2.isEmpty());

        num2.clear();

        System.out.println(num2.isEmpty());

        System.out.println("\n");

        GenericCont<Boolean> answer = new GenericCont<>(true);

        System.out.println(answer.getValue());

        System.out.println(answer.isEmpty());

        answer.clear();

        System.out.println(answer.isEmpty());


    }
}

