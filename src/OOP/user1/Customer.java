package OOP.user1;

public class Customer extends User {
    String product;

    @Override
    void login() {
        System.out.println("Customer: " + name + " enjoy the system.");
    }

    public Customer(String name,String product) {
        super(name);
        this.product = product;
    }

    void placeOrder(String product){
        System.out.println("Order: " + product + " was successfully bought by " + name);
    }
}

//🟢 Задача: Пользователи системы
//Условие
//
//Создай базовый класс User с полем name и методом login().
//
//Создай классы-наследники:
//
//Admin — добавь метод banUser(String username).
//
//Customer — добавь метод placeOrder(String product).
//
//В main() создай список List<User> users, куда положи и админов, и покупателей.
//
//Пройдись по списку:
//
//вызови у всех login(),
//
//если это Admin → downcast и вызови banUser(),
//
//если это Customer → downcast и вызови placeOrder().