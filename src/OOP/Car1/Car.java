package OOP.Car1;

public class Car extends Vehicle {

    String brand;

    public Car(double speed, String brand) {
        super(speed);
        this.brand = brand;
    }



    @Override
    void move() {
        System.out.println(brand + " moving with this speed: " + super.speed + " km/h");
    }


}



// 🟢 Задание 1 — Простое наследование
//
//Задача:
//Создай класс Vehicle с полями speed и методом move(), который выводит "Транспорт движется со скоростью X км/ч".
//Создай класс Car, который наследует Vehicle и добавляет поле brand. Переопредели метод move(), чтобы он выводил "Марка X движется со скоростью Y км/ч", используя super для доступа к скорости.
//