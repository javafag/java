package OOP.Robots;

public abstract class Robot {

    String name;

    abstract void work();

    Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


//
//Создай абстрактный класс Robot, в котором будут:
//
//поле name;
//
//абстрактный метод work().
//
//Создай интерфейсы:
//
//Chargeable с методом charge() (зарядка робота);
//
//Movable с методом move() (движение робота).
//
//Создай классы:
//
//CleanerRobot, который наследует Robot и реализует Movable;
//
//BattleRobot, который наследует Robot и реализует оба интерфейса (Movable, Chargeable).
//
//В main() создай массив роботов и вызови у каждого:
//
//work();
//
//если робот реализует Movable → вызвать move().
//
//если робот реализует Chargeable → вызвать charge().
