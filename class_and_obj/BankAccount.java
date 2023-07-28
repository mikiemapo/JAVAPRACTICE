package class_and_obj;

public class BankAccount {
    String accountHolder;
    double accountValue;

    void printInfo() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Account Value: " + "$" + accountValue);
    }

}
