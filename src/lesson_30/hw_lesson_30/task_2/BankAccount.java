package lesson_30.hw_lesson_30.task_2;

public class BankAccount implements PaymentSystem {
    private double totalAmount;
    private double amount;


    public BankAccount(double totalAmount) {
        this.totalAmount = totalAmount / RATE_EUR_USD;
//        this.amount = amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        double amountInEur = amount / RATE_EUR_USD;
        if (totalAmount >= amountInEur) {
            totalAmount -= amountInEur;
            System.out.printf("Списываются деньги со счета в кол-ве %.2f %s\n", amountInEur / RATE_EUR_USD, CURRENCY_NAME_EUR);
        } else {
            System.out.printf("Недостаточно средств для снятия %.2f %s. Доступно для снятия: %.2f %s\n"
                    , amountInEur, CURRENCY_NAME_EUR, totalAmount, CURRENCY_NAME_EUR);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        totalAmount += amount / RATE_EUR_USD;
        System.out.printf("Поступление денег на счет в кол-ве %.2f %s\n", amount / RATE_EUR_USD, CURRENCY_NAME_EUR);
    }

    @Override
    public void checkBalance() {
        System.out.printf("Остаток на счете: %.2f %s\n", totalAmount, CURRENCY_NAME_EUR);
    }
}
