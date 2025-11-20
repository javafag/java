package threads;

//✔ Упражнение 1
//
//Создай 3 потока, каждый печатает своё имя и числа 0–4.
//Ожидаемый вывод должен быть типа:

public class ex1 {
    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Worker: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Worker interrupted!");
                    return;
                }
            }
            System.out.println("Worker finished normally");
        });


        worker.start();

        worker.join();



    }
}
