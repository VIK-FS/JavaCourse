package lesson_30.hw_lesson_30.task_3;

public class ElectronicWallet implements PaymentSystem {
    private static int counter = 1001;
    private final int walletNumber;
    private double totalAmount;

    public ElectronicWallet(double totalAmount) {
        this.walletNumber = counter++;
        this.totalAmount = totalAmount;
    }

    public int getWalletNumber() {
        return walletNumber;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (totalAmount >= amount) {
            totalAmount -= amount;
            System.out.printf("Кошелек #%d: Снятие %.2f %s\n", walletNumber, amount, CURRENCY_NAME_USD);
        } else {
            System.out.printf("Кошелек #%d: Недостаточно средств. Доступно: %.2f %s\n", walletNumber, totalAmount, CURRENCY_NAME_USD);
        }
    }

    @Override
    public void depositTransfer(double amount) {
        totalAmount += amount;
        System.out.printf("Кошелек #%d: Пополнение на %.2f %s\n", walletNumber, amount, CURRENCY_NAME_USD);
    }

    @Override
    public void checkBalance() {
        System.out.printf("Кошелек #%d: Баланс: %.2f %s\n", walletNumber, totalAmount, CURRENCY_NAME_USD);
    }

    @Override
    public void transferMoney(PaymentSystem recipient, double amount) {
        if (totalAmount >= amount) {
            this.withdrawMoney(amount);

            if (recipient instanceof ElectronicWallet) {
                recipient.depositTransfer(amount);
                System.out.printf("Перевод %.2f %s с кошелька #%d на кошелек #%d завершен.\n",
                        amount, CURRENCY_NAME_USD, this.walletNumber, ((ElectronicWallet) recipient).walletNumber);
            } else if (recipient instanceof BankAccount) {
                double convertedAmount = amount / RATE_EUR_USD;
                recipient.depositTransfer(convertedAmount);
                System.out.printf("Перевод %.2f %s (%.2f %s после конвертации) с кошелька #%d на счет #%d завершен.\n",
                        amount, CURRENCY_NAME_USD, convertedAmount, CURRENCY_NAME_EUR,
                        this.walletNumber, ((BankAccount) recipient).getAccountNumber());
            }
        } else {
            System.out.printf("Кошелек #%d: Недостаточно средств для перевода.\n", walletNumber);
        }
    }
}
