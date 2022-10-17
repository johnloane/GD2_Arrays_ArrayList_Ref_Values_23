package com.dkit.gd2.johnloane.testing;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest
{
    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("This executes before any tests. Count = " + count++);
    }

    @Before
    public void setup()
    {
        account = new BankAccount("Dillon", "Long", 1000, BankAccount.CURRENT);
        System.out.println("Running a test");
    }

    @Test
    public void deposit()
    {
        double balance = account.deposit(200, true);
        double expectedBalance = 1200;
        assertEquals(expectedBalance, balance, 0.000001);
    }

    @Test
    public void getBalance_deposit()
    {

        account.deposit(200, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw()
    {
        account.withdraw(50.0, true);
        assertEquals(950.0, account.getBalance(), 0);

    }

    @Test
    public void withdrawBranch()
    {
        double balance = account.withdraw(600.0, true);
        assertEquals(400.0, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdrawNotBranch()
    {
        double balance = account.withdraw(600.0, false);
        assertEquals(400.0, balance, 0);
    }

    @Test
    public void isCurrent_true()
    {
        assertTrue("The account is NOT a current account", account.isCurrent());
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("Thus executes after all of the test cases. Count = " + count++);
    }

    @After
    public void teardown()
    {
        System.out.println("Count = " + count++);
    }
}