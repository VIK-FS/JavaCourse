package lesson_30.hw_lesson_30.task_3;

public class BankAccount implements PaymentSystem {
    private static int counter = 10001;
    private final int accountNumber;
    private double totalAmount;

    public BankAccount(double totalAmount) {
        this.accountNumber = counter++;
        this.totalAmount = totalAmount / RATE_EUR_USD;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void withdrawMoney(double amount) {
        double amountInEur = amount / RATE_EUR_USD;
        if (totalAmount >= amountInEur) {
            totalAmount -= amountInEur;
            System.out.printf("Счет #%d: Снятие %.2f %s\n", accountNumber, amountInEur, CURRENCY_NAME_EUR);
        } else {
            System.out.printf("Счет #%d: Недостаточно средств. Доступно: %.2f %s\n"
                    , accountNumber, totalAmount, CURRENCY_NAME_EUR);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        double amountInEur = amount / RATE_EUR_USD;
        totalAmount += amountInEur;
        System.out.printf("Счет #%d: Пополнение на %.2f %s\n", accountNumber, amountInEur, CURRENCY_NAME_EUR);
    }

    @Override
    public void checkBalance() {
        System.out.printf("Счет #%d: Баланс: %.2f %s\n", accountNumber, totalAmount, CURRENCY_NAME_EUR);
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount) {
        double amountInEur = amount / RATE_EUR_USD;
        if (totalAmount >= amountInEur) {
            this.withdrawMoney(amount);

            if (recipient instanceof BankAccount) {
                recipient.depositTransfer(amount);
                System.out.printf("Перевод %.2f %s со счета #%d на счет #%d завершен.\n",
                        amountInEur, CURRENCY_NAME_EUR, this.accountNumber, ((BankAccount) recipient).accountNumber);
            } else if (recipient instanceof ElectronicWallet) {
                double convertedAmount = amount * RATE_EUR_USD;
                recipient.depositTransfer(convertedAmount);
                System.out.printf("Перевод %.2f %s (%.2f %s после конвертации) со счета #%d в кошелек #%d завершен.\n",
                        amountInEur, CURRENCY_NAME_EUR, convertedAmount, CURRENCY_NAME_USD,
                        this.accountNumber, ((ElectronicWallet) recipient).getWalletNumber());
            }
        } else {
            System.out.printf("Счет #%d: Недостаточно средств для перевода.\n", accountNumber);
        }
    }

}

