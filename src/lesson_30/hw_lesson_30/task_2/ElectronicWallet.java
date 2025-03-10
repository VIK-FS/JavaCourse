package lesson_30.hw_lesson_30.task_2;

public class ElectronicWallet implements PaymentSystem {
    private double totalAmount;
    private double amount;
//    protected double currencyUsd;

    public ElectronicWallet(double totalAmount) {
        this.totalAmount = totalAmount;
//        this.amount = amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (totalAmount - amount >= 0) {
            totalAmount -= amount;
            System.out.printf("Списываются деньги со счета в кол-ве %.2f %s\n", amount, CURRENCY_NAME_USD);
        } else {
            System.out.printf("Недостаточно средств для снятия %.2f %s. Доступно для снятия: %.2f %s\n"
                    , amount, CURRENCY_NAME_USD, totalAmount, CURRENCY_NAME_USD);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        totalAmount += amount;
        System.out.printf("Поступление денег на счет в кол-ве %.2f %s\n", amount, CURRENCY_NAME_USD);
    }

    @Override
    public void checkBalance() {
        System.out.printf("Остаток на счете: %.2f %s\n", totalAmount, CURRENCY_NAME_USD);
    }
}
