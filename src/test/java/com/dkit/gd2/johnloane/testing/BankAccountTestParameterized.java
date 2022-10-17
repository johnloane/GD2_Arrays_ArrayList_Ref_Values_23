package com.dkit.gd2.johnloane.testing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized
{
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected)
    {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup()
    {
        account = new BankAccount("Keven", "Vokin", 20000, BankAccount.CURRENT);
        System.out.println("Running a test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions()
    {
        return Arrays.asList(new Object[][]{
                {100.0, true, 20100.0},
                {200.0, true, 20200.0},
                {325.14, true, 20325.14},
                {489.33, true, 20489.33},
                {1000.0, true, 21000.0},
        });
    }

    @Test
    public void deposit()
    {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), .01);
    }


}
