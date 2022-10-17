package com.dkit.gd2.johnloane.classconstructorsinheritance;

public class VIP
{
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIP()
    {
        this("Default name", 50000.0, "default@gmail.com");
    }

    public VIP(String name, double creditLimit)
    {
        this(name, creditLimit, "unknown");
    }

    public VIP(String name, double creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }
}
