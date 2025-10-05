package OOP.exeptions;

public class BankAccount {

    private double money;
    private final String accName;


    class NegativeDepositException  extends RuntimeException{
        public NegativeDepositException(String message) {
            super(message);
        }
    }

    class InsufficientFundsException extends Exception{
        public InsufficientFundsException(String message){
            super(message);
        }
    }

    public BankAccount(String accName, Double money) {
        this.accName = accName;
        this.money = money;
    }


    public Double getMoney() {
        return money;
    }

    public String getAccName() {
        return accName;
    }

    public void deposit(Double amount) throws NegativeDepositException, InsufficientFundsException{
        if (amount <= 0) { throw new NegativeDepositException("Сумма депозита должна быть положительной");}
        money += amount;
    }

    public void printBalance() {
        System.out.println("Account " + accName + " balance: " + money);
    }

    public void  withdraw(Double amount) throws InsufficientFundsException{
        if (money < amount){
            throw new InsufficientFundsException("Недостаточно средств");
        }
        money-=amount;
    }

    public void transfer(BankAccount target, double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new NegativeDepositException("Сумма перевода должна быть положительной");

        }

        if (money<amount)  {
            throw new InsufficientFundsException("Сумма перевода должна быть больше либо равной сумме баланса отправителя");

       }
            this.withdraw(amount);
            target.deposit(amount);

            System.out.println("Переведено " + amount + " со счёта " + accName +
                    " на счёт " + target.accName);



    }

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("1234",0.0);
        BankAccount bankAccount2 = new BankAccount("12345",0.0);


        try {
            bankAccount1.deposit(100.0);
            bankAccount1.deposit(-50.0); //
        } catch (NegativeDepositException | InsufficientFundsException e) {
            System.out.println("Ошибка депозита: " + e.getMessage());
        }finally {
            System.out.println("Операция завершена");
        }




        try {
            bankAccount2.deposit(100.0);
            bankAccount2.withdraw(200.0);
        }catch (InsufficientFundsException e){
            System.out.println("Withdraw mistake: " + e.getMessage());
        }finally {
            System.out.println("Операция завершена");
        }


        try {
            bankAccount1.transfer(bankAccount2,100.0);
        }catch (InsufficientFundsException e){
            System.out.println("Transfer mistake: " + e.getMessage());
        }finally {
            System.out.println("Oперация завершена");
        }




        bankAccount1.printBalance();
        bankAccount2.printBalance();







    }
}




//💼 Проект: Мини-банк
//
//
//2. Создай 2 пользовательских исключения:
//
//NegativeDepositException — unchecked (наследник RuntimeException), если сумма депозита отрицательная.
//
//InsufficientFundsException — checked (наследник Exception), если баланс меньше снимаемой суммы.
//
//3. В BankAccount добавь методы:
//public void deposit(double amount)   // бросает NegativeDepositException
//public void withdraw(double amount) throws InsufficientFundsException // checked
//public void printBalance()
//
//4. В main() напиши логику:
//
//Создай счёт с нулевым балансом.
//
//Попробуй:
//
//внести отрицательную сумму → поймать NegativeDepositException
//
//снять деньги, когда баланс меньше → поймать InsufficientFundsException
//
//выполнить корректную операцию (например, deposit → withdraw)
//
//В конце — в finally вывести сообщение "Операции завершены".
//
//💻 Пример ожидаемого вывода:
//Ошибка депозита: Сумма депозита должна быть положительной
//Ошибка снятия: Недостаточно средств
//Account 111 balance: 50.0
//Операции завершены
//
//💡 Дополнительное задание (по желанию):
//
//Добавь метод transfer(BankAccount target, double amount) — перевод между счетами с проверками и исключениями.
//
//Используй try-with-resources или finally, чтобы выводить "Перевод завершён", даже при ошибках.
//
//Добавь обработку нескольких исключений через multi-catch:
//
//catch (NegativeDepositException | InsufficientFundsException e)