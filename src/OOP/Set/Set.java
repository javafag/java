package OOP.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        String[] fruits = {"Seek1", "Aeek2", "Seek3", "Seek4", "Seek5"};


        HashSet<String> hashSet = new HashSet<>();
        for (String fruit : fruits) {
            hashSet.add(fruit);
        }

        System.out.println("HashSet (произвольный порядок): " + hashSet);


        LinkedHashSet<String> linkedList = new LinkedHashSet<>();
        for (String fruit : fruits){
            linkedList.add(fruit);
        }

        System.out.println("LinkedSet (порядок вставки): " + linkedList);

        TreeSet<String> treeSet = new TreeSet<>();
        for (String fruit : fruits){
            treeSet.add(fruit);
        }

        System.out.println("TreeSet (алфавитный порядок): " + treeSet);

    }

}

//Условие:
//Есть список слов с дубликатами:
//        ["apple", "banana", "apple", "orange", "banana", "kiwi"]
//Необходимо:
//Убрать все дубликаты.
//Вывести элементы:
//
//a) в произвольном порядке (HashSet)
//
//b) в порядке вставки (LinkedHashSet)
//
//c) в отсортированном порядке (TreeSet)
