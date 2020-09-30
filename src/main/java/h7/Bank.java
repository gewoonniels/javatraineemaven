package h7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

public class Bank {
    public ArrayList<BankAccount> allBankAccounts = new ArrayList<BankAccount>();

    public void addAccount(BankAccount account) {
        this.allBankAccounts.add(account);
    }

    public BigDecimal getTotalMoneyOfBank() {
        BigDecimal total = new BigDecimal(0);
        for (int i = 0; i < allBankAccounts.size(); i++) {
            total = total.add(allBankAccounts.get(i).getBalance());
        }
        return total;
    }

    public void transferMoney(BankAccount from, BankAccount to, BigDecimal money) {
        from.withdrawMoney(money);
        to.depositMoney(money);
    }

    public void printOverview() {
        for (int i = 0; i < allBankAccounts.size(); i++) {
            System.out.println(allBankAccounts.get(i));
        }
    }

    @Override
    public String toString() {
        String returnString = "Deze bank beschikt over de volgende accounts: " + "\n";
        for (int i = 0; i < allBankAccounts.size(); i++) {
            returnString += allBankAccounts.get(i).toString() + "\n";
        }
        return returnString;
    }

    public BankAccount createAccount(AccountType accountType, BigDecimal balance) {
        if (accountType.equals(AccountType.CHECKINGACCOUNT)) {
            return new CheckingAccount(balance, this);
        }
        if (accountType.equals(AccountType.SAVINGACCOUNT)) {
            return new SavingsAccount(balance, new BigDecimal(1.0), this);
        }
        return null;
    }

    public abstract class BankAccount {
        private String accountNumber;
        private BigDecimal balance;
        private Bank bank;
        private Person person;

        public BankAccount(BigDecimal balance, Bank bank) {
            this.balance = balance;
            this.accountNumber = createAccountNumber();
            this.bank = bank;
            bank.addAccount(this);
        }

        public BankAccount(BigDecimal balance, BigDecimal interestRate, Bank bank, Person person) {
            this(balance, bank);
            this.person = person;
        }

        private String createAccountNumber() {
            return UUID.randomUUID().toString();
        }

        public BigDecimal getBalance() {
            return this.balance;
        }

        public BigDecimal withdrawMoney(BigDecimal money) {
            if (this.balance.subtract(money).compareTo(BigDecimal.ZERO) < 0) {
                //@TODO hier een exception van maken ?
                System.out.println("Dit kan niet gebeuren omdat u anders rood staat");
            } else {
                this.balance = balance.subtract(money);
            }
            return this.balance;
        }

        public BigDecimal depositMoney(BigDecimal money) {
            this.balance = balance.add(money);
            return this.balance;
        }

//        public BigDecimal calculateInterest() {
//            BigDecimal hundred = new BigDecimal(100);
//            return balance.divide(hundred).multiply(interestRate);
//        }

        @Override
        public String toString() {
            String owner = person != null ? person.toString() : "No owner";
            return "BankAccount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
//                    ", interestRate=" + interestRate +
//                    ", interest this year: " + calculateInterest() +
                    ", Owner: " + owner +
                    '}';
        }
    }

    private class CheckingAccount extends BankAccount {

        public CheckingAccount(BigDecimal balance, Bank bank) {
            super(balance, bank);

        }
    }

    private class SavingsAccount extends BankAccount {
        BigDecimal interestRate;

        public SavingsAccount(BigDecimal balance, BigDecimal interestRate, Bank bank) {
            super(balance, bank);
            this.interestRate = interestRate;
        }
    }


}
