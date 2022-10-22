package com.dkit.gd2.johnloane.classconstructorsinheritance;

import java.util.ArrayList;

public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, ArrayList<String> colour, boolean male, int size, double weight, int age, String type, int gills, int eyes, int fins)
    {
        super(name, colour, male, size, weight, age, type);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    
    private void rest()
    {
        
    }
    
    private void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveBackFin()
    {
    }

    private void moveMuscles()
    {
    }

}
