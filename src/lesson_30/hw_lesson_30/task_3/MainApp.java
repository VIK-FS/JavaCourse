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

Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */
package lesson_30.hw_lesson_30.task_3;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("======Банковские счета======");
        BankAccount ba1 = new BankAccount(1000);
        BankAccount ba2 = new BankAccount(2000);

        ba1.checkBalance();
        ba2.checkBalance();

        ba1.transferMoney(ba2, 300);
        ba1.checkBalance();
        ba2.checkBalance();

        System.out.println("\n======Электронные кошельки======");
        ElectronicWallet ew1 = new ElectronicWallet(500);
        ElectronicWallet ew2 = new ElectronicWallet(1000);

        ew1.checkBalance();
        ew2.checkBalance();

        ew1.transferMoney(ew2, 200);
        ew1.checkBalance();
        ew2.checkBalance();

        System.out.println("\n======Переводы между системами======");
        ba1.transferMoney(ew1, 100);
        ew2.transferMoney(ba2, 250);
    }
}
