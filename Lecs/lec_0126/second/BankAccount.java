package second;

public class BankAccount {
    private static int interest; 
    private int balance;
    private String name;
    
    public void withDraw(int amount) { 
        // int result = name;
        if (amount > this.balance) {
            System.out.println("Ins... fund");
            return;
        }

        this.balance -= amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public static void setInterest(int interestRatio) {
        interest = interestRatio;
    }

}

class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton != null) {
            return singleton;
        } else {
            singleton = new Singleton();
            return singleton;
        }
    }
}

class Test {
    
    public static void main(String[] args) {
        // BankAccount bankAccount = new BankAccount();
        // bankAccount.deposit (100);
        // System.out.println(bankAccount.getBalance());
        // bankAccount.withDraw(50);
        // System.out.println(bankAccount.getBalance());
        // bankAccount.withDraw(100);
        // System.out.println(bankAccount.getBalance());

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount.setInterest(5);

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton.toString());
        System.out.println(singleton2.toString());

    }
    
}
