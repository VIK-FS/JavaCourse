package homeworks.hw_30.task_2;

public class BankAccount extends Account{

    public BankAccount(String title) {
       super(title);
       currency = "EUR";
       typeAccount = "Bank";
    }

    @Override
    public double getCourseToEur() {
        return 1;
    }

    @Override
    public String toString(){
        return String.format("%s %s. Balance: %.2f %s", typeAccount, getTitle(), checkBalance(), currency);
    }


    @Override
    public void transferMoney(double amount, PaymentSystem recipient) {

    }

    @Override
    public String getCurrency() {
        return "";
    }
}
