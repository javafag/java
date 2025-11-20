package OOPBasics.Car1;

public class Vehicle {

    double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    void move(){
        System.out.println("Transport moving with this speed: " + speed + " km/h");
    }




    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(120);

        vehicle.move();

        Car car = new Car(120,"Rari");

        car.move();


    }

}


// 🟢 Задание 1 — Простое наследование
//
//Задача:
//Создай класс Vehicle с полями speed и методом move(), который выводит "Транспорт движется со скоростью X км/ч".
//Создай класс Car, который наследует Vehicle и добавляет поле brand. Переопредели метод move(), чтобы он выводил "Марка X движется со скоростью Y км/ч", используя super для доступа к скорости.
//