package threads;





public class threads {

    private static int count = 0;

    public static synchronized void increment(){
        count++;
    }

    public synchronized int getCount(){
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        threads counter = new threads();

        Runnable task = (() -> {
            for (int i = 0; i < 1000; i++){
               threads.increment();
            }
        });

        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task);


        thread1.start();
        thread.start();

        thread.join();
        thread1.join();

        System.out.println(counter.getCount());

    }
}
