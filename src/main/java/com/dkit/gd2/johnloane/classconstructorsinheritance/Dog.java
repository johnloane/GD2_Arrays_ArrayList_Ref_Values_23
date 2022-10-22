package com.dkit.gd2.johnloane.classconstructorsinheritance;

import java.util.ArrayList;

public class Dog extends Animal
{
    private String breed;
    private boolean pedigree;
    private boolean trained;
    private boolean neutered;
    private boolean microchipped;

    public Dog(String name, ArrayList<String> colour, boolean male, int size, double weight, int age, String type, String breed, boolean pedigree, boolean trained, boolean neutered, boolean microchipped)
    {
        super(name, colour, male, size, weight, age, type);
        this.breed = breed;
        this.pedigree = pedigree;
        this.trained = trained;
        this.neutered = neutered;
        this.microchipped = microchipped;
    }

    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew()
    {
        System.out.println("Dog.chew() called");
    }
}
