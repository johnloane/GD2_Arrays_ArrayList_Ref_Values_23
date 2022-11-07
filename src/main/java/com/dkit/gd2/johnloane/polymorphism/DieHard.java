package com.dkit.gd2.johnloane.polymorphism;

public class DieHard extends Movie
{
    public DieHard(String name)
    {
        super(name);
    }

    @Override
    public String plot()
    {
        return "Guy stuck in airport trying to get home for Christmas. Kills lots of bad people";
    }
}
