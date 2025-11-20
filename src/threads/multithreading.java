package threads;


import java.util.concurrent.atomic.AtomicInteger;

public class multithreading {

    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {


        Runnable task = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incrementAndGet(); // ✔ потокобезопасно
            }
            System.out.println(Thread.currentThread().getName() + ": " + counter);
        };

        Thread a = new Thread(task, "A");
        Thread b = new Thread(task, "B");

        a.start();
        b.start();
    }

}
