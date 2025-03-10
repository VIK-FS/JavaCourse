package lesson_30.hw_lesson_30.task_2;


public interface PaymentSystem {
    String CURRENCY_NAME_USD = "USD";
    String CURRENCY_NAME_EUR = "EUR";
    double RATE_EUR_USD = 1.08;
//    int USD = 840;
//    int EUR = 978;

    void withdrawMoney(double amount);

    void depositTransfer(double amount);

    void checkBalance();
}
