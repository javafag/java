package Other;

import java.io.IOException;


class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class showcase {


    static void checkedDemo() throws IOException{
        throw new IOException("file not found");
    }

    static void uncheckedDemo() {
        throw new ArithmeticException("divide by zero");
    }  // throws RuntimeException

    static void customDemo() throws MyCustomException {
        throw new MyCustomException("Моя собственная ошибка!");
    }

    static void errorDemo(){
        throw new StackOverflowError("boom");
    }






    public static void main(String[] args) {


        try {
            checkedDemo();
        }catch (Exception e){
            System.out.println("checked demo caught: " + e.getMessage());
        }

        try {
            uncheckedDemo();
        }catch (Exception e){
            System.out.println("unchecked demo caught: " + e.getMessage());
        }

        try {
            customDemo();
        }catch (Exception e){
            System.out.println("custom demo caught: " + e.getMessage());
        }

        try {
            errorDemo();
        }catch (Error e){
            System.out.println("system error demo caught: " + e.getMessage());
        }
    }




}


//💥 ЗАДАНИЕ
//
//Создай класс ErrorShowcase, где ты продемонстрируешь все 4 типа проблем:
//
//        1️⃣ Checked exception — компилятор заставит обработать (IOException, SQLException и т.п.)
//2️⃣ Unchecked exception (runtime) — падает при запуске (NullPointerException, ArithmeticException, и т.д.)
//3️⃣ Custom exception — сам создаёшь свой класс и выбрасываешь
//4️⃣ Error — системная ошибка JVM (StackOverflowError, OutOfMemoryError, и т.п.)