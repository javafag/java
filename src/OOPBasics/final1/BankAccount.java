package OOPBasics.final1;

public class BankAccount {

    final String accountNumber;
    int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0; // изначально баланс = 0
    }

    // final метод: нельзя переопределить в наследниках
    public final void deposit(int amount) {
        balance += amount;
    }

    public void printBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}



// Наследник
class PremiumAccount extends BankAccount {

    public PremiumAccount(String accountNumber) {
        super(accountNumber);
    }

    public void giveBonus(int bonus) {
        balance += bonus;
    }


}






// final класс
final class FinalBank {
    String name = "Central Bank";
}







class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("111");
        acc.deposit(100);
        acc.printBalance();

        PremiumAccount prem = new PremiumAccount("222");
        prem.deposit(200);
        prem.giveBonus(50);
        prem.printBalance();
    }
}
//🟢 Задание
//
//Создай класс BankAccount с:
//
//final String accountNumber (номер счёта, задаётся в конструкторе).
//
//поле balance (не final, можно менять).
//
//Сделай метод final void deposit(double amount) — добавляет деньги на счёт.
//
//Сделай класс PremiumAccount, который наследует BankAccount.
//
//Добавь метод giveBonus(), который увеличивает баланс.
//
//Попробуй переопределить deposit() → ошибка.
//
//Создай класс FinalBank (с final) → попробуй наследоваться от него → ошибка.
//
//👉 Попробуй это реализовать, а потом покажи код.
//Хочешь, я кину тебе каркас (заготовку), чтобы ты дописал?