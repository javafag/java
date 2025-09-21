package OOP.Robots;

public class BattleRobot extends Robot implements Movable,Chargeable {

    BattleRobot(String name) {
        super(name);
    }



    @Override
    public void charge() {
        System.out.println(name + "is charging");
    }


    @Override
    void work() {
        System.out.println(name + "is working");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }
}
