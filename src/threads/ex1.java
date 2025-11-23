package threads;

//✔ Практика для тебя
//
//Напиши поток с бесконечным циклом, который проверяет volatile boolean flag
//
//Main поток через 2 сек меняет flag = false
//
//Проверь, что поток корректно завершился
import java.util.LinkedList;
import java.util.Queue;


public class ex1 {


        private static final Queue<Integer> queue = new LinkedList<>();
        private static final int LIMIT = 5;

        public static void main(String[] args) throws InterruptedException {


           Thread producer = new Thread(() ->{
              int value = 0;

               while (true){
                   synchronized (queue){
                       while (queue.size() == LIMIT){
                           try {
                               queue.wait();
                           }catch (InterruptedException e){
                           }
                       }
                       queue.add(value);
                       System.out.println("Prod added value" + value);
                       value++;
                       queue.notifyAll();

                   }
               }
           });

           Thread consumer = new Thread(() -> {
              while (true){
                  synchronized (queue){
                    while (queue.isEmpty()){
                        try {
                            queue.wait();
                        }catch (InterruptedException e){
                            return;
                        }
                    }
                      int val = queue.poll();
                      System.out.println("Consumer takes value" + val);
                      queue.notifyAll();

                  }
              }
           });


            producer.start();
            consumer.start();

        }
    }
