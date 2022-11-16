package com.dkit.gd2.johnloane.polyhamburger;

public class DeluxeBurger extends Hamburger
{
    public DeluxeBurger()
    {
        super("Deluxe", "Beef", 14.54, "White");
        super.addTopping(new ExtraTopping("Chips", 2.75));
        super.addTopping(new ExtraTopping("Drink", 1.80));
    }

    @Override
    public void addTopping(ExtraTopping extra)
    {
        System.out.println("Cannot add any extra toppings");
    }

    @Override
    public double itemiseHamburger()
    {
        double hamburgerPrice = super.getPrice();
        System.out.printf("%s hamburger is on a %s roll with %s, comes with chips and drink, price is € %.2f", super.getName(), super.getBreadRollType(), super.getMeat(), super.getPrice());
        System.out.println();
        return hamburgerPrice;
    }
}
