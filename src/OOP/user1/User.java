package OOP.user1;

import java.util.Arrays;
import java.util.List;

public abstract class User {

    String name;

     abstract void login();


    public User(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new Admin("Mike","Jone123"),
                new Customer("Alice","Notebook")
        );

        for(User user : users){
            user.login();

            if(user instanceof Admin){
                ((Admin) user).BanUser("Alice");
            } else if (user instanceof Customer) {
                ((Customer) user).placeOrder("Notebook");
            }
            System.out.println("");
        }
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