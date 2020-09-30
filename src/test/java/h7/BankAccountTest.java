package h7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    Bank bank;
    Bank.BankAccount savingsaccount;
    Bank.BankAccount checkingaccount;

    @BeforeEach
    void setUp() {
        bank = new Bank();
        savingsaccount = bank.createAccount(AccountType.SAVINGACCOUNT, new BigDecimal(10));
        checkingaccount = bank.createAccount(AccountType.CHECKINGACCOUNT, new BigDecimal(10));
    }

    @Test
    public void BalanceShouldRaiseByDeposit() {
        //when
        savingsaccount.depositMoney(new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(15), savingsaccount.getBalance());
    }

    @Test
    public void BalanceShouldDescendByDeposit() {
        //when
        savingsaccount.withdrawMoney(new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(5), savingsaccount.getBalance());
    }

    @Test
    public void TransferShouldLowerFirstAccount() {
        //given
        //when
        bank.transferMoney(savingsaccount, checkingaccount, new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(5), savingsaccount.getBalance());
    }

    @Test
    public void TransferShouldRaiseSecondAccount() {
        //given
        //when
        bank.transferMoney(savingsaccount, checkingaccount, new BigDecimal(5));
        //then
        assertEquals(new BigDecimal(15), checkingaccount.getBalance());
    }


}