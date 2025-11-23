package threads;

//❗ ЗАДАНИЕ
//
//Сделай мини-очередь задач:
//
//очередь: List<Integer>
//
//producer кладёт числа 0…9
//
//consumer забирает и печатает
//
//если очередь пустая → consumer WAIT
//
//если очередь полная (>3 элемента) → producer WAIT
//
//используй wait()/notifyAll()









//🎯 Теперь твоё задание (простое, как ты хотел)
//🔥 ЗАДАНИЕ
//
//Сделай класс:
//
//class BankAccount
//
//
//У него есть поле:
//
//private int balance = 0;
//
//
//Тебе нужно:
//
//        1️⃣ Реализовать метод deposit(int amount) как synchronized method
//2️⃣ Реализовать метод withdraw(int amount) через synchronized block
//3️⃣ Создать 2 потока через лямбды:
//
//поток A: делает 5 депозитов по 100
//
//поток B: делает 5 снятий по 50
//
//        4️⃣ Запустить потоки, дождаться через join, вывести итоговый баланс.

public class BankAccount {

    private int balance = 0;


    public void dep(int amount){
        synchronized (this) {
            balance += amount;
        }
        System.out.println(Thread.currentThread().getName() +
                " DEPOSIT " + amount);

        try { Thread.sleep(50); } catch (InterruptedException ignored) {}
    }

    public synchronized void withdraw(int amount){
        synchronized (this){
            balance-=amount;
        }
        System.out.println(Thread.currentThread().getName() +
                " -> withdraw +" + amount + ", balance = " + balance);
        try {Thread.sleep(50); } catch (InterruptedException ignored) {}
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
       BankAccount account = new BankAccount();

       Thread thread = new Thread(() -> {
           for (int i = 0; i < 5; i++) {
               account.dep(100);
           }
       });

       Thread thread1 = new Thread(() ->{
           for (int i = 0; i < 5; i++){
               account.withdraw(50);
           }
       });

       thread.start();
       thread1.start();

       thread.join();
       thread1.join();

        System.out.println("\nFinal balance = " + account.getBalance());

    }
}
