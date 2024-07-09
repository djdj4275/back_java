package section08;

public class BankProcedural {

    static double balance = 0;

    public static void deposit(double amount) {
        balance += amount;
    }

    public static void withdraw(double amount) {
        balance -= amount;
    }

    public static void printBalance() {
        System.out.println("잔액 : " + balance);
    }

    public static void main(String[] args) {
        deposit(1000);
        deposit(1000);

        printBalance();

        withdraw(500);

        printBalance();
    }
}
