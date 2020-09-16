import h7.BankAccount;

import java.math.BigDecimal;

public class Start {

    public static void main(String[] args) {
//        HomeWork3 h3 = new HomeWork3();
//        h3.showDifference();
//        h3.calculateJ();
//        System.out.println(h3.calculateBinary("1010", "100"));
//        h3.calculateTime(23, 80);
//
//        Client client1 = new Client("Jan");
//        Client client2 = new Client("Piet");
//        client2 = client1;
//        client2.firstName = "Joris";
//
//        System.out.println(client1.firstName);

//        HomeWorkH4 h4 = new HomeWorkH4();
//        h4.coldOrWarm(Season.SUMMER);
//        h4.printHourGlass(11);


//        Lab4 lab4 = new Lab4();
//        lab4.checkAccountNumber();

//        Lab5 lab5 = new Lab5();
//        System.out.println(lab5.greatest(3,7));
//        System.out.println(lab5.greatest(2,3,4,88,5,6));
//        System.out.println(lab5.factorial(5));
//        HomeWorkH5 hw5 = new HomeWorkH5();
//        System.out.println(hw5.fibo(6));  /* 1 1 2 3 5 8 */
//        hw5.fibo(4, 6); /*4 4 8 12 20 32.*/
//        System.out.println(hw5.fibo(4, 5, 6)); /*4 5 9 14 23*/
//        System.out.println(hw5.goldenRatio(47));
//        System.out.println(hw5.goldenRatioByFibo(10));

//        Lab6 lab6 = new Lab6();
//        lab6.calculateSum();
//        lab6.print3By3Array();

//        long[] row = new long[4];
//        row[2] = 3;
//        long[] copy = row;
//        copy[2]++;
//
//        System.out.println(copy[2]++);

//        HomeWorkH6 h6 = new HomeWorkH6();
//        long[] a = h6.doubleArraySize(new long[]{1L, 2L, 3L, 4L});
//        a = h6.fibo(4, 5, 6);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        Person p = new Person("Jan", 45);
//        System.out.println(p.getGender());
//        p.setGender(Gender.MALE);
//        System.out.println(p.getGender());
//        p.haveBirthday(); // person gets one year older
//        System.out.println(p.getAge());
//        System.out.println(Person.numberOfPossibleGenders);

        BigDecimal b1money = new BigDecimal(10);
        BigDecimal b2money = new BigDecimal(2222);
        BigDecimal interest = new BigDecimal(1.6);


        BankAccount b1 = new BankAccount(b1money, interest);
        BankAccount b2 = new BankAccount(b2money, interest);
        System.out.println(b1);
        System.out.println(b2);
        b1.transferMoney(b2, new BigDecimal(5));
        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(b2.calculateInterest());
//        System.out.println(BankAccount.getTotalMoneyOfBank());
//        for (int i = 0; i < BankAccount.allBankAccounts.size(); i++) {
//            System.out.println(BankAccount.allBankAccounts.get(i));
//        }
    }
}
