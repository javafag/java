package threads;



import java.util.ArrayList;
import java.util.List;

public class MessageBox {

    private String message;
    private List<String> mqueue = new ArrayList<>();

    public synchronized void put(String msg){
        message = msg;
        mqueue.add(msg);
        System.out.println("Producer: положил -> " + msg);
        notify();
    }

    public synchronized String take () throws InterruptedException {
        while (mqueue.isEmpty()) {
            wait();
        }
        String result = mqueue.remove(0); // берём первый элемент
        System.out.println("Consumer: забрал -> " + result);
        return result;
    }

    public static void main(String[] args) throws InterruptedException {

        MessageBox MBox = new MessageBox();

        Thread producer = new Thread(() -> {
            String[] messages = {"Olek", "Olek1", "Olek2", "Olek3", "Olek4"};
            for (String msg : messages) {
                MBox.put(msg);
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) { // ожидаем 5 сообщений
                try {
                    MBox.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

    }
}
