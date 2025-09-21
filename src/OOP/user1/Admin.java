package OOP.user1;

public class Admin extends User {

    String username;

    @Override
    void login() {
        System.out.println("Admin: " + username + " вошёл в систему");
    }



    public Admin(String username,String name) {
        super(name);
        this.username = username;
    }



    void BanUser(String name){
        System.out.println("User: " + name + " has been banned.");
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