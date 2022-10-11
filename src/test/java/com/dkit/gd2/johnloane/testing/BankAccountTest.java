package com.dkit.gd2.johnloane.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest
{

    @Test
    public void deposit()
    {
        BankAccount johnsAccount = new BankAccount("John", "Loane", 100);
        double balance = johnsAccount.deposit(200, true);
        double expectedBalance = 300;
        assertEquals(expectedBalance, balance, 0.000001);
    }

    @Test
    public void withdraw()
    {
       fail("This test has not been implemented yet");
    }
}