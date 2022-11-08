package com.dkit.gd2.johnloane.polymorphism;

public class Ferrari extends Car
{
    public Ferrari(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Ferrari->startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Ferrari->accelerate()";
    }

    @Override
    public String brake()
    {
        return "Ferrari->brake()";
    }
}
