public class AccountFactory {
    private int accountNumber;
    private static  AccountFactory factory; 

    private AccountFactory() {}

    public static AccountFactory getFactory() {
        if (factory == null) {
            factory = new AccountFactory();
        }
        return factory;
    }

    public int getAccountNumber() {
        return this.accountNumber++;
    }
}

class Bank {
    public static void main(String[] args) {
        AccountFactory accountFactory = AccountFactory.getFactory();
        int accountNumber = accountFactory.getAccountNumber();
        int accountNumber2 = accountFactory.getAccountNumber();
        System.out.println(accountNumber);
        System.out.println(accountNumber2);
    }
}

