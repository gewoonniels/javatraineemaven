package h7;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {
    public ArrayList<BankAccount> allBankAccounts = new ArrayList<BankAccount>();

    public void addAccount(BankAccount account) {
        this.allBankAccounts.add(account);
    }

    public BankAccount openAccount(BigDecimal balance, BigDecimal interestRate) {
        BankAccount bankaccount = new BankAccount(balance, interestRate, this);
        return bankaccount;
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
}
