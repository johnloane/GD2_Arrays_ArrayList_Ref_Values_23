package com.dkit.gd2.johnloane.polyhamburger;

import java.util.ArrayList;

public class Hamburger
{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    //There are a max of 4 extra toppings here
    private ArrayList<ExtraTopping> extraToppings;

    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.extraToppings = new ArrayList<>();
    }

    public void addTopping(ExtraTopping extratop)
    {
        if(this.extraToppings.size() < 4)
        {
            this.extraToppings.add(extratop);
        }
        else
        {
            System.out.println("Can't add " + extratop.getName());
        }
    }

    public double itemiseHamburger()
    {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "is on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is €" + this.price);
        if(this.extraToppings.size() > 0)
        {
            for(ExtraTopping topping : this.extraToppings)
            {
                hamburgerPrice += topping.getPrice();
                System.out.printf("Added %s for an extra €%.2f \n", topping.getName(), topping.getPrice());
            }
            System.out.println();
        }
        return hamburgerPrice;
    }

    @Override
    public String toString()
    {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType='" + breadRollType + '\'' +
                ", extraToppings=" + extraToppings +
                '}';
    }
}

