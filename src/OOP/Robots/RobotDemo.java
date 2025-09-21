package OOP.Robots;

public class RobotDemo {


    public static void main(String[] args) {
        Robot[] robots = {
                new CleanerRobot("Roomba-X1"),
                new BattleRobot("Terminator-T800"),
                new CleanerRobot("CleanBot-Pro"),
                new BattleRobot("WarMachine-Alpha")
        };

        System.out.println("=== Демонстрация работы роботов ===\n");


        for(Robot robot : robots){
            System.out.println("Robot: " + robot.getName());

            robot.work();

            if (robot instanceof Movable ){
                ((Movable) robot).move();
            }

            if (robot instanceof Chargeable) {
                ((Chargeable) robot).charge();
            }

            System.out.println();
        }

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