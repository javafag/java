package OOP.enumka;

public class Shop {
    public static void main(String[] args) {

        for (OrderState status : OrderState.values()) {
            System.out.println(status + ": " + status.getDescription() +
                    " — можно отменить: " + status.isCancelable());
        }
    }
}
