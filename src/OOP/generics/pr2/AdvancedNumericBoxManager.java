package OOP.generics.pr2;

public class AdvancedNumericBoxManager <T extends Number> {
    private T value;

    public AdvancedNumericBoxManager(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public Double sum(AdvancedNumericBoxManager<? extends Number> other){
        double sum = 0;
        return sum = this.value.doubleValue() + other.value.doubleValue();
    }

    public boolean isGreaterThan(AdvancedNumericBoxManager<? extends Number> other){
        return this.value.doubleValue() > other.value.doubleValue();
    }

    public <U extends Number> void swapValue(AdvancedNumericBoxManager<U> other) {
        Number temp = this.value;
        this.value = (T) other.get();
        other.set((U) temp);
    }

    @Override
    public String toString() {
        return "AdvancedNumericBoxManager{" +
                "value=" + value +
                '}';
    }


    public static void main(String[] args) {
        AdvancedNumericBoxManager <Integer> intik = new AdvancedNumericBoxManager<>(33);

        AdvancedNumericBoxManager <Double> doblik = new AdvancedNumericBoxManager<>(35.0);

        AdvancedNumericBoxManager <Float> flotik = new AdvancedNumericBoxManager<>(66.0f);

        System.out.println(doblik.sum(intik));

        System.out.println(doblik.isGreaterThan(intik));

        doblik.swapValue(flotik);
        System.out.println("После swap - doblik: " + doblik + ", flotik: " + flotik);


     }

}


//📝 Задание: AdvancedNumericBoxManager

//
//3️⃣ Main / AdvancedNumericBoxManager
//
//Задачи в main():
//
//Создать 3 AdvancedNumericBox разных типов (Integer, Double, Float)
//
//Продемонстрировать sum() и isGreaterThan() между ними
//
//Использовать swapValue() для двух коробок и вывести результат
//
//Создать список Integer и Double, применить fillIntegers(), printAll() и sumAll()
//
//Найти максимальное значение списка через findMax()