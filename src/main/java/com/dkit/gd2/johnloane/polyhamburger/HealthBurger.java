package com.dkit.gd2.johnloane.polyhamburger;

public class HealthBurger extends Hamburger
{
    public HealthBurger(String meat, double price)
    {
        super("Healthy", meat, price, "Brown Rye");
    }

    @Override
    public void addTopping(ExtraTopping extra)
    {
        if(super.extraToppings.size() < 6)
        {
            super.extraToppings.add(extra);
        }
        else
        {
            System.out.println("Can't add " + extra.getName());
        }
    }
}
