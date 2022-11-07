package com.dkit.gd2.johnloane.polymorphism;

public class FastAndFurious extends Movie
{
    public FastAndFurious(String name)
    {
        super(name);
    }

    @Override
    public String plot()
    {
        return "Family";
    }
}
