package OOP.equalsHashCodeToString.Cat1;

 public class Cat {

     public static final int MAX_LIVES = 9;

     static int catCount = 0;


     int livesRemaining;
    String name;
    int age;



     public Cat(){
         catCount++;
         livesRemaining = MAX_LIVES;

     }

     public Cat(String name, int age, int livesRemaining) {
         this.name = name;
         this.age = age;
         this.livesRemaining = livesRemaining;
     }

     public static int getCatCount(){
         return catCount;
     }
}
