package Other.rep;
import java.util.LinkedList;

public class SCO {




    public static void main(String[] args) {

        Order order1 = new Order(1234,"Lex",250.0, OrderStatus.PENDING);
        Order order2 = new Order(12345,"Lex",250.0, OrderStatus.PENDING);
        Order order3 = new Order(12346,"Lex",250.0, OrderStatus.CANCELLED);
        Order order4 = new Order(12347,"Lex",251.0, OrderStatus.DELIVERED);

        LinkedList<Order> orders = new LinkedList<>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);

        System.out.println("ВСЕ ЗАКАЗЫ:\n");
        for(Order order : orders){
            System.out.println(order);
        }

        double wholeAmount = 0;

        System.out.println("\nАКТИВНЫЕ ЗАКАЗЫ:\n");
        for(Order order : orders){
           if(order.status() != OrderStatus.CANCELLED && order.status() != OrderStatus.DELIVERED) {
               System.out.println(order);
           }

        }


        double deliveredAmount = 0;
        for (Order order : orders) {
            if (order.status() == OrderStatus.DELIVERED) {
                deliveredAmount += order.amount();
            }
        }
        System.out.println("СУММА ДОСТАВЛЕННЫХ: " + deliveredAmount);



        Order thickesOrder = order1;
        for(Order orders1 : orders){
            if(orders1.amount() > thickesOrder.amount()){
                thickesOrder = orders1;
            }
        }


        System.out.println("\nCАМЫЙ ДОРОГОЙ ЗАКАЗ: " + thickesOrder);

    }

}


//Задание: Система управления заказами
//Создай систему с enum и record:
//        1. Создай enum OrderStatus со статусами:
//
//PENDING (ожидание)
//PROCESSING (обработка)
//SHIPPED (отправлен)
//DELIVERED (доставлен)
//CANCELLED (отменен)
//
//2. Создай record Order:
//
//id (int)
//customerName (String)
//amount (double)
//status (OrderStatus)
//
//3. В main() создай массив/список заказов и:
//
//Выведи все заказы
//Найди и выведи все активные заказы (статус не CANCELLED и не DELIVERED)
//Найди заказ с максимальной суммой
//Подсчитай общую стоимость доставленных заказов (DELIVERED)