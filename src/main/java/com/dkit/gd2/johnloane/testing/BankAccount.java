package com.dkit.gd2.johnloane.testing;

public class BankAccount
{
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    //If the branch argument is true then the transaction was performed in a branch. Otherwise at an ATM
    public double deposit(double amount, boolean branch)
    {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch)
    {
        balance -= amount;
        return balance;
    }

    public double getBalance()
    {
        return balance;
    }
}
