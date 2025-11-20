package OOPBasics.equalsHashCodeToString.Cat1;

public class smt {
    public static void main(String[] args) {



        Cat myCat = new Cat();

        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());



    }
}



//ТЗ:
//
//Создай два объекта String с одинаковым содержимым, один через литерал, другой через new String().
//
//Выведи на экран:
//
//результат ==
//
//результат equals()
//
//результат сравнения hashCode()
//
//Создай HashSet<String> и добавь первый объект.
//
//Проверь, содержит ли сет второй объект.