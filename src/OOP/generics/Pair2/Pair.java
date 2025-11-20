package OOP.generics.Pair2;

public class Pair <K,V> {



    private K key;
    private V value;


    public Pair(K key,V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }



    public Pair<V,K> swap() {
        return new Pair<>(value,key);
    }

}



//## 📝 Задание: Класс Pair<K, V>
//
//Создай класс `Pair<K, V>` для хранения пары ключ-значение:
//
//        **Требования:**
//
//        ### Класс Pair<K, V>
//- Поля `key` типа `K` и `value` типа `V`
//        - Конструктор `Pair(K key, V value)`
//        - Геттеры `getKey()` и `getValue()`
//        - Метод `swap()` — возвращает новый Pair с перевернутыми местами (key становится value, value становится key)
//- Метод `toString()` — красивый вывод
//

//
