package bank;

public class BankAccount {

    private String accountName;

    private int balance;
    private final String accountNumber;

    public BankAccount(String accountName, int balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(String accountNumber, int deposit) throws Exception {
        if (deposit < 0) {
            throw new Exception("Negatív számot adott meg az összeghez !");

        }
        balance += deposit;
    }

    public void withdraw(String accountNumber, int withdraw) throws Exception {
        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            throw new Exception("Nincs elég pénz a számlán !");
        }
    }

    public void transfer(BankAccount targetAccount, int amount) throws Exception {
        if (balance >= amount) {
            balance -= amount;
            targetAccount.balance += amount;

        } else {
            throw new Exception("Az átutalandó összeg nem áll rendelkezésre !");


        }
    }

    public static boolean isValidAccountNumber(String givenAccountNumber) {
        int sum = 0;
        for (int i = 0; i < givenAccountNumber.length(); i++) {
            sum += Integer.parseInt(givenAccountNumber.substring(i, i + 1));

        }
        int firstNumber = Integer.parseInt(givenAccountNumber.substring(0, 1));
        int lastNumber = Integer.parseInt
                (givenAccountNumber.substring(givenAccountNumber.length() - 1));
        return (sum >= 20 && firstNumber % 2 == lastNumber % 2);
    }

}
