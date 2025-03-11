package homeworks.hw_30.task_2;

public interface PaymentSystem {
    void withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();
    void transferMoney(double amount, PaymentSystem recipient);
    String getCurrency();
    String getTitle();
    // Получение курса Валюта счета к евро
    abstract double getCourseToEur();


}
