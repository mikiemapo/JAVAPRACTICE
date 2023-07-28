package class_and_obj;

public class Main {
    public void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "John Doe";
        account.accountValue = 99.99;
        System.out.println(account.accountHolder);

        account.printInfo();
    }
}
