package OOP.generics.pr;


public class NumericBox <T extends Number> {

    private T value;


    public NumericBox(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }




    public boolean isGreaterThan(NumericBox<? extends  Number> other){
        return this.value.doubleValue() > other.value.doubleValue();
    }

    public Double sum(NumericBox<? extends Number> other){

        return this.value.doubleValue() + other.value.doubleValue();
    }

    @Override
    public String toString() {
        return "NumericBox{" +
                "value=" + value +
                '}';
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