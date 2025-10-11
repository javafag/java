package OOP.Queue;


import java.util.PriorityQueue;

public class TaskManager implements Comparable<TaskManager> {

    private String name;
    private int priority;
    private int duration;


    public TaskManager(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(TaskManager other) {
        return Integer.compare(this.priority, other.priority);
    }


    @Override
    public String toString() {
        return name + " (priority: " + priority + ", duration: " + duration + "s )";
    }

    public static void main(String[] args) {


        TaskManager task1 = new TaskManager("Big mamba",2,3);
        TaskManager task2 = new TaskManager("Big mamba",1,2);
        TaskManager task3 = new TaskManager("Big mamba",3,6);
        TaskManager task4 = new TaskManager("Big mamba",4,8);


        PriorityQueue<TaskManager> Queue = new PriorityQueue<>();


        Queue.add(task1);
        Queue.add(task2);
        Queue.add(task3);
        Queue.add(task4);


        while (!Queue.isEmpty()) {
            System.out.println("Next task: " + Queue.poll());
        }

    }


}


//public interface Queue<E> extends Collection<E> {
//    boolean add(E e);        // добавить элемент (бросает исключение, если не удалось)
//    boolean offer(E e);      // добавить элемент (возвращает false, если не удалось)
//
//    E remove();              // удалить и вернуть первый элемент (исключение, если пусто)
//    E poll();                // удалить и вернуть первый элемент (null, если пусто)
//
//    E element();             // просто вернуть первый элемент (исключение, если пусто)
//    E peek();



//🧩 ТЗ: "Планировщик задач с приоритетами"
//        📋 Описание
//Реализуй консольную программу на Java, которая моделирует работу простого планировщика задач.
//Каждая задача имеет:

//имя (String name)
//приоритет (int priority), где меньше число → выше приоритет
//время выполнения (int duration, секунды)
//
//Программа должна:
//
//Считать список задач (можно захардкодить или вводить с консоли).
//
//Добавить их в PriorityQueue.
//
//Обрабатывать задачи в порядке приоритета.
//
//При обработке каждой задачи — выводить сообщение вроде:
//
//Выполняется: Backup database (priority: 1, duration: 5s)
//
//
//После выполнения всех задач — вывести сообщение
//
//Все задачи выполнены!
