package OOP.enumka;

public enum OrderState {

    NEW("New order",true),
    PAID("Order Paid",true),
    SHIPPED("Order shipped",false),
    DELIVERED("Order delivered",false),
    CANCELED("Order canceled",false);



    public String getDescription(){
        return description;
    }

    public boolean isCancelable() {
        return cancelable;
    }

    private final String description;
    private final boolean cancelable;

    OrderState( String description, boolean cancelable) {

        this.description = description;
        this.cancelable = cancelable;
    }
}


///🔹 Задание: enum OrderStatus
//📋 Условие:
//
//Создай enum OrderStatus с такими состояниями заказа:
//
//NEW — новый заказ
//
//PAID — оплачен
//
//SHIPPED — отправлен
//
//DELIVERED — доставлен
//
//CANCELED — отменён
//
//Каждый статус должен хранить:
//
//текстовое описание (на русском),
//
//флаг, можно ли этот заказ ещё отменить (true/false).
//
//        ⚙️ Требуется:
//
//Определить конструктор и поля в enum.
//
//Реализовать метод getDescription() и isCancelable().
//
//В main() пройти по всем статусам и вывести: