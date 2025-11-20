package OOP.generics.Pair2;

public class Utils {

    public static <K, V> Pair<K, V> createPair(K key, V value){
        return new Pair<>(key,value);
    }

    public static<K> boolean areKeysEqual(Pair<K, ?> p1, Pair<K, ?> p2){

        if(p1 == null || p2 == null) {
            return false;
        }
        if (p1.getKey() == null || p2.getKey() == null){
            return false;
        }
        return p1.getKey().equals(p2.getKey());

    }

    public static <T> void printArray(T[] array){
        if (array == null) {
            System.out.println("Массив пустой");
            return;
        }

        for (T element : array) {
            System.out.println(element);
        }
    }
}


//### Static методы в классе Util:
//        1. `<K, V> Pair<K, V> createPair(K key, V value)` — фабричный метод для создания пары
//2. `<K, V> boolean areKeysEqual(Pair<K, V> p1, Pair<K, V> p2)` — сравнить ключи двух пар
//3. `<T> void printArray(T[] array)` — вывести массив любого типа