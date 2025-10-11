package OOP.Queue;


import java.util.PriorityQueue;


public class Restick implements Comparable<Restick> {

    private String order;
    private int priority;


    public Restick(String order, int priority) {
        this.order = order;
        this.priority = priority;
    }


    @Override
    public int compareTo(Restick other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Serving: " + order + " (priority " + priority + ")";
    }

    public static void main(String[] args) {




        PriorityQueue<Restick> resticks = new PriorityQueue<>();

        resticks.add(new Restick("Pizza",4));
        resticks.add(new Restick("Sushi",3));
        resticks.add(new Restick("Coffee",1));
        resticks.add(new Restick("Burger",2));


        while (!resticks.isEmpty()) {
            System.out.println(resticks.poll());
        }

        System.out.println("All orders have been completed!");

    }
}

//🧠 ТЗ для тебя (простое)
//🎯 Задача: “Очередь заказов”
//
//Описание:
//
//Создай очередь (Queue<String>)
//
//Добавь туда несколько заказов (например, "Пицца", "Суши", "Кофе", "Бургер")
//
//Затем обслужи все заказы по порядку (FIFO):
//        — доставай из очереди (poll) и печатай:
//        "Обслуживается заказ: Пицца"
//        и так, пока очередь не станет пустой.
//
//Условия:
//
//Используй Queue<String> и LinkedList.
//
//Программа должна показать, что заказы выполняются в порядке поступления.
//
//После выполнения всех заказов выведи сообщение "Все заказы обслужены!"