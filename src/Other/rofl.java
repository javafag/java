package Other;

import java.util.ArrayList;
import java.util.List;


public class rofl implements Comparable<rofl> {
    private Double speed;


    @Override
    public int compareTo(rofl other) {
        return this.speed.compareTo(other.speed);
    }

    public rofl(Double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "rofl{" +
                "speed=" + speed +
                '}';
    }

    public static void main(String[] args) {
        rofl rofl1 = new rofl(12.1);
        rofl rofl3 = new rofl(15.1);

        rofl rofl2 = new rofl(21.1);

        List<rofl> rofls = new ArrayList<>();
        rofls.add(rofl1); rofls.add(rofl2);


        rofl currentMax = rofls.get(0);

        for(rofl roflik: rofls){

            if (roflik.compareTo(currentMax) > 0){
                currentMax = roflik;
            }
        }
        System.out.println(currentMax);
    }
}
