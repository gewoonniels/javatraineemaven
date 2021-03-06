//package h7;
//
//import java.math.BigDecimal;
//import java.util.UUID;
//
//public class BankAccount {
//    private String accountNumber;
//    private BigDecimal balance;
//    private BigDecimal interestRate;
//    private Bank bank;
//    private Person person;
//
//    public BankAccount(BigDecimal balance, BigDecimal interestRate, Bank bank) {
//        this.balance = balance;
//        this.interestRate = interestRate;
//        this.accountNumber = createAccountNumber();
//        this.bank = bank;
//        bank.addAccount(this);
//    }
//
//    public BankAccount(BigDecimal balance, BigDecimal interestRate, Bank bank, Person person) {
//        this(balance, interestRate, bank);
//        this.person = person;
//    }
//
//    private String createAccountNumber() {
//        return UUID.randomUUID().toString();
//    }
//
//    public BigDecimal getBalance() {
//        return this.balance;
//    }
//
//    public BigDecimal withdrawMoney(BigDecimal money) {
//        if (this.balance.subtract(money).compareTo(BigDecimal.ZERO) < 0) {
//            //@TODO hier een exception van maken ?
//            System.out.println("Dit kan niet gebeuren omdat u anders rood staat");
//        } else {
//            this.balance = balance.subtract(money);
//        }
//        return this.balance;
//    }
//
//    public BigDecimal depositMoney(BigDecimal money) {
//        this.balance = balance.add(money);
//        return this.balance;
//    }
//
//    public BigDecimal calculateInterest() {
//        BigDecimal hundred = new BigDecimal(100);
//        return balance.divide(hundred).multiply(interestRate);
//    }
//
//    @Override
//    public String toString() {
//        String owner = person != null ? person.toString() : "No owner";
//        return "BankAccount{" +
//                "accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                ", interestRate=" + interestRate +
//                ", interest this year: " + calculateInterest() +
//                ", Owner: " + owner +
//                '}';
//    }
//}
