package OOP.generics.GenericCount;

public @interface ТЗ {
}

//Задание: Generic контейнер
//Задача
//Создай generic класс Container<T> который может хранить значение любого типа.
//Требования
//Класс Container
//
//Поле value типа T (может быть null)
//Конструктор по умолчанию
//Конструктор с параметром T value
//Метод setValue(T value) - установить значение
//Метод getValue() - получить значение
//Метод isEmpty() - возвращает true если value == null
//Метод clear() - обнулить значение
//
//В main()
//Создай несколько контейнеров разных типов:
//
//Container<String> - со строкой
//Container<Integer> - с числом
//Container<Double> - с дробным числом
//Container<Boolean> - с boolean
//
//Для каждого:
//
//Выведи значение через getValue()
//Проверь isEmpty()
//Очисти через clear()
//Проверь isEmpty() после очистки
//
//Пример вывода
//=== Container<String> ===
//Значение: Привет
//isEmpty: false
//После clear():
//Значение: null
//isEmpty: true
//
//        === Container<Integer> ===
//Значение: 42
//isEmpty: false
//После clear():
//Значение: null
//isEmpty: true
//
//        ... и так далее
//        Подсказки
//
//Используй this.value = value; в конструкторе
//isEmpty() проверяет value == null
//Вывод может быть в виде таблицы или текста

//Цель: Понять, как работает <T> и как один класс может работать с разными типами.
