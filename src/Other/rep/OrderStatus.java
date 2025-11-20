package Other.rep;

public enum OrderStatus {


    PENDING ("Waiting"),

    PROCESSING ("In progress"),
    SHIPPED ("Sent"),
    DELIVERED ("Delivered"),
    CANCELLED ("Canceled");


    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private final String description;






}


//1. Создай enum OrderStatus со статусами:
//
//PENDING (ожидание)
//PROCESSING (обработка)
//SHIPPED (отправлен)
//DELIVERED (доставлен)
//CANCELLED (отменен)