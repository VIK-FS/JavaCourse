/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
package lesson_30.hw_lesson_30.task_2;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("======BankAccount=======");
        BankAccount ba = new BankAccount(1000);
        ba.checkBalance();
        ba.depositTransfer(1000);
        ba.checkBalance();
        ba.withdrawMoney(2500);
        ba.checkBalance();

        System.out.println("======ElectronicWallet=======");


        ElectronicWallet ew = new ElectronicWallet(1000);
        ew.checkBalance();
        ew.depositTransfer(1000);
        ew.checkBalance();
        ew.withdrawMoney(500);
        ew.checkBalance();
    }

}
