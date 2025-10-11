package Other;

import static java.lang.Integer.compare;

public class file {

    public static void main(String[] args) {


        Integer[] nums = {3,2,1,4,5};

        int min = nums[0];

        for(int i = 1; i < nums.length; i++ ){

            if(compare(nums[i], min) < 0){
                min = nums[i];
            }
        }

        System.out.println(min);
    }
}


//< 0	Первый объект “меньше” второго

//0	Они равны

//> 0	Первый объект “больше” второго