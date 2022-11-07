package com.dkit.gd2.johnloane.polymorphism;

public class Movie
{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public String plot()
    {
        return null;
    }
}
