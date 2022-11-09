package com.dkit.gd2.johnloane.polyhamburger;

public class ExtraTopping
{
    private String name;
    private double price;

    public ExtraTopping(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "ExtraToppings{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
