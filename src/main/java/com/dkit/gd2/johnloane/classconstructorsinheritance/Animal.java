package com.dkit.gd2.johnloane.classconstructorsinheritance;

import java.util.ArrayList;

public abstract class Animal
{
    private String name;
    private ArrayList<String> colour;
    private boolean male;
    private int size;
    private double weight;
    private int age;
    private String type;

    public Animal(String name, ArrayList<String> colour, boolean male, int size, double weight, int age, String type)
    {
        this.name = name;
        this.colour = colour;
        this.male = male;
        this.size = size;
        this.weight = weight;
        this.age = age;
        this.type = type;
    }

    public void eat()
    {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed)
    {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<String> getColour()
    {
        return colour;
    }

    public boolean isMale()
    {
        return male;
    }

    public int getSize()
    {
        return size;
    }

    public double getWeight()
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    public String getType()
    {
        return type;
    }
}
