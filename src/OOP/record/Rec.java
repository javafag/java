package OOP.record;

public class Rec {

    public record alligator(String name,Integer age){
        @Override
        public String toString() {
            return "Name: " + name +" Age: "+ age;
        }

    }



    public static void main(String[] args) {

        alligator alligator1 = new alligator("Senior",12);



        System.out.println(alligator1);


    }
}
