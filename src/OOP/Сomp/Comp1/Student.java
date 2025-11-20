package OOP.Сomp.Comp1;

//Начнем с базы:
//Задача 1 (Легкая)
//Создай класс Student с полями:
//
//name (String)
//grade (int) - оценка от 1 до 5
//
//Твоя задача:
//        Реализуй Comparable, чтобы студенты сортировались по оценке (от большей к меньшей)
//Создай список из 5 студентов
//Отсортируй его через Collections.sort()
//Выведи результат
//
// Задача 2 (Средняя)
//Добавь в класс Student еще одно поле:
//
//age (int)
//
//Твоя задача:
//
//НЕ меняй compareTo() (пусть остается сортировка по grade)
//Создай три разных Comparator:
//
//По имени (алфавитный порядок)
//По возрасту (от младшего к старшему)
//По возрасту И имени (если возраст одинаковый, то по имени)
//
//
//Отсортируй список тремя способами и выведи результаты
//
//Попробуй! 💪


import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;





public class Student implements Comparable<Student> {
    private String name;
    private int grade;
    private int age;

    @Override
    public int compareTo(Student other) {
        return other.grade - this.grade ;
    }

    public Student(String name,Integer grade,int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }

    //
//    // Или с лямбдой (Java 8+)
//    Comparator<Person> byAge = (p1, p2) -> p1.getAge() - p2.getAge();









    public static void main(String[] args) {

        Student student1 = new Student("Olek1",10,18);
        Student student2 = new Student("Olek2",12,18);
        Student student3 = new Student("Olek3",15,19);
        Student student4 = new Student("Olek4",13,20);
        Student student5 = new Student("Olek5",20,18);




        List<Student> students = new LinkedList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        Collections.sort(students);
        System.out.println("По оценке (compareTo):\n" + students + "\n");


        Comparator<Student> byName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        };

        Collections.sort(students, byName);
        System.out.println("По имени:\n" + students + "\n");

        Comparator<Student> byAge = (o1, o2) -> o1.getAge() - o2.getAge();
        Collections.sort(students, byAge);
        System.out.println("По возрасту:\n" + students + "\n");

        Comparator<Student> byAgeAndName = Comparator
                .comparing(Student::getAge)
                .thenComparing(Student::getName);
        Collections.sort(students, byAgeAndName);

        Collections.sort(students, byAgeAndName);
        System.out.println("По возрасту → имени:\n" + students);


    }

}



