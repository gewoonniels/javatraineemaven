package h7;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @Test
    public void BalanceShouldRaiseByDeposit() {
        //given
        BankAccount account = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        //when
        account.depositMoney(new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(15), account.getBalance());
    }

    @Test
    public void BalanceShouldDescendByDeposit() {
        //given
        BankAccount account = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        //when
        account.withdrawMoney(new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(5), account.getBalance());
    }

    @Test
    public void TransferShouldLowerFirstAccount() {
        //given
        BankAccount account1 = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        BankAccount account2 = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        //when
        account1.transferMoney(account2, new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(5), account1.getBalance());
    }

    @Test
    public void TransferShouldRaiseSecondAccount() {
        //given
        BankAccount account1 = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        BankAccount account2 = new BankAccount(new BigDecimal(10), new BigDecimal(1.8));
        //when
        account1.transferMoney(account2, new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(15), account2.getBalance());
    }


}