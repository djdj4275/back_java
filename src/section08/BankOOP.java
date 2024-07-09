package section08;

class BankAccount {
    int balance = 0;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("잔액 : " + balance);
    }
}

public class BankOOP {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();
    }
}
