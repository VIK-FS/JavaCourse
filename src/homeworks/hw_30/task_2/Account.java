package homeworks.hw_30.task_2;

public  abstract class Account implements PaymentSystem {
    private String title;
    private double balance;

    protected  String currency;
    protected String typeAccount;

    public Account(String title) {
        this.title = title;
    }


    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.printf("Недостаточно денег на счету для снятия %.2f Еuro\n", amount);
            return;
        }
    }



    @Override
    public void depositTransfer(double amount) {
        if (amount <= 0) return;
        balance += amount;
        System.out.printf("Банк %s. Зачислено на счет $%.2f Euro\n", title, balance);
    }

    @Override
    public double checkBalance() {

        return balance;
    }



    public String getTitle() {
        return title;
    }


}
