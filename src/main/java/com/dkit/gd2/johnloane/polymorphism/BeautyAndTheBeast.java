package com.dkit.gd2.johnloane.polymorphism;

public class BeautyAndTheBeast extends Movie
{
    public BeautyAndTheBeast(String name)
    {
        super(name);
    }

    @Override
    public String plot()
    {
        return "Stockholm syndrome";
    }
}
