import h12.AnnotationHelper;
import h7.Person;

public class Start {

    public static void main(String[] args) {
//        ScannerFunctions scanner = new ScannerFunctions();
//        System.out.println(scanner.returnInputLength());

        Person p = new Person("niels", 23);
        p.addHistory("lang geleden");
        p.addHistory("nog veel langer geleden");
        p.printHistory();
        System.out.println(p.createSubHuman().greet());

        AnnotationHelper anno = new AnnotationHelper();
        anno.printAnnotations(p.getClass());


//        Bank bank = new Bank();
//        Bank.BankAccount account1 = bank.createAccount(AccountType.CHECKINGACCOUNT, new BigDecimal(20));
//        Bank.BankAccount account2 = bank.createAccount(AccountType.SAVINGACCOUNT, new BigDecimal(110220));
//        bank.printOverview();
//        bank.transferMoney(account1, account2, new BigDecimal(10));
//        bank.printOverview();
    }
}
