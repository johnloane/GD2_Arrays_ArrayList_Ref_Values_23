package com.dkit.gd2.johnloane.classconstructorsinheritance;

public class Account
{
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //Constructor chaining
    public Account()
    {
        this("12345", 0.0, "Default name", "Default address", "Default Phone");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.getBalance());
    }

    public void withdraw(double withdrawalAmount)
    {
        if(this.balance - withdrawalAmount < 0)
        {
            System.out.println("Only " + this.balance + " available. Insufficient funds");
        }
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrew " + withdrawalAmount + " balance is now " + this.balance);
        }
    }

    public String getNumber()
    {
        return number;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public String getCustomerPhoneNumber()
    {
        return customerPhoneNumber;
    }
}
