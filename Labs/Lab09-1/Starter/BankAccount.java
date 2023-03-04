import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;
    AccountType accountType;

    private static long nextAccountNumber;

    public BankAccount() {
        this.accountNumber = nextNumber();
        this.accountType = accountType.Checking;
        this.balance = new BigDecimal("0");
    }
    
    public BankAccount(AccountType accountType) {
        this.accountNumber = nextNumber();
        this.ownerName = "UnKnown";
        this.accountType = accountType;
        this.balance = new BigDecimal("0");
    } 

    public BankAccount(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.accountType = AccountType.Checking;
        this.balance = balance;
    }     

    public BankAccount(String ownerName, AccountType accountType, BigDecimal balance) {
        this(ownerName, balance);
        this.accountType = accountType;
    }
    
    private static long nextNumber() {
        return nextAccountNumber++;
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }
        
    public long getNumber() {
        return this.accountNumber;
    }
        
    public String getOwnerName() {
        return this.ownerName;
    }
        
    public BigDecimal getBalance() {
        return this.balance;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }
    
    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    public boolean withDraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }

    public void transferFrom(BankAccount accFrom, BigDecimal amount) {
        if (accFrom.withDraw(amount)) {
            this.deposit(amount);
        }
    }

}

class CreateAccount {
    /*
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        newAccount.setData(ownerName, balance);

        return newAccount;
    }
    */

    public static void TestDeposit(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        account.deposit(amount);
        scanner.close();
    }

    public static void TestWithDraw(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)) {
            System.out.println("Insufficient funds!");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(AccountType.Checking);
        BankAccount bankAccount2 = new BankAccount("NGS", new BigDecimal("500000000"));
        BankAccount bankAccount3 = new BankAccount("NGS", AccountType.Saving, new BigDecimal("10000000000"));

        printBankAccount(bankAccount);
        printBankAccount(bankAccount2);
        printBankAccount(bankAccount3);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Balance: " + account.getBalance() + "\n");
    }
}