package OOP.Collections;

import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // сортировка по возрасту
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class CollectionsDemo {
    public static void main(String[] args) {

        // ===== 1️⃣ List =====
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList:");
        for(String s : arrayList) System.out.print(s + " ");
        System.out.println("\n");

        // ===== 2️⃣ Set =====
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3,1,2,3));
        System.out.println("HashSet (уникальные элементы): " + hashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3,1,2));
        System.out.println("TreeSet (отсортировано): " + treeSet + "\n");

        // ===== 3️⃣ Map =====
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("HashMap:");
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        // ===== 4️⃣ Queue/Deque =====
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        System.out.println("Deque operations:");
        System.out.println("removeFirst: " + deque.removeFirst());
        System.out.println("removeLast: " + deque.removeLast() + "\n");

        // ===== 5️⃣ Comparable & Comparator =====
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Сортировка через Comparable (по возрасту)
        Collections.sort(people);
        System.out.println("Sorted by age (Comparable): " + people);

        // Сортировка через Comparator (по имени)
        people.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("Sorted by name (Comparator): " + people + "\n");

        // ===== 6️⃣ Iterator =====
        Iterator<String> it = arrayList.iterator();
        System.out.print("Iterator: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ===== 7️⃣ ListIterator =====
        ListIterator<String> li = arrayList.listIterator();
        System.out.print("ListIterator forward: ");
        while(li.hasNext()) System.out.print(li.next() + " ");
        System.out.print("\nListIterator backward: ");
        while(li.hasPrevious()) System.out.print(li.previous() + " ");
    }
}
