package OOP.generics.pr;

import java.util.List;

public class BoxUtils {

    public static <T> void printAll(List<T> list){

        for(T data : list){
            System.out.println(data);
        }
    }

    public static double sumAll(List<? extends Number> list ){
        double sum = 0;
        for (Number t : list){
            sum+= t.doubleValue();
        }
        return sum;
    }

    public static void fillIntegers(List<? super Integer> list){
        list.add(30);
        list.add(20);
        list.add(10);
    }



    public static <T extends Number> double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }

}


