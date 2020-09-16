package h7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    public static ArrayList<BankAccount> allBankAccounts = new ArrayList<BankAccount>();
    private BigDecimal balance;
    private BigDecimal interestRate;

    public BankAccount(BigDecimal balance, BigDecimal interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountNumber = createAccountNumber();
        BankAccount.allBankAccounts.add(this);
    }

    public static BigDecimal getTotalMoneyOfBank() {
        BigDecimal total = new BigDecimal(0);
        for (int i = 0; i < allBankAccounts.size(); i++) {
            BigDecimal money = allBankAccounts.get(i).balance;
            total.add(allBankAccounts.get(i).balance);
        }
        return total;
    }

    private String createAccountNumber() {
        return UUID.randomUUID().toString();
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public BigDecimal withdrawMoney(BigDecimal money) {
        if (this.balance.subtract(money).compareTo(BigDecimal.ZERO) < 0) {
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

    public void transferMoney(BankAccount account, BigDecimal money) {
        this.withdrawMoney(money);
        account.depositMoney(money);
    }

    public BigDecimal calculateInterest() {
        BigDecimal hundred = new BigDecimal(100);
        return balance.divide(hundred).multiply(interestRate);
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", interest this year: " + calculateInterest() +
                '}';
    }
}
