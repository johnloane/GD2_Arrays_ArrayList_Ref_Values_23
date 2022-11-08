package com.dkit.gd2.johnloane.polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        chooseTenRandomMovies();
        testCars();
        //Create a base class called car
        //A car should have engine, cylinders, wheels etc
        //Constructor should initialize the number of cylinders, set wheels to 4
        //and engine to true, Cylinders and names are passwed as parameters
        //Create appropriate getters
        //Create some methods like startEngine, accelerate and brake
        //Show a message for each of these methods in the base class
        //Create 3 subclasses for your favourite cars
        //Override the appropriate methods to demonstrate polymorphism
    }

    private static void testCars()
    {
        Car mitsubishi = new Mitsubishi(4, "Outlander");
        System.out.println(mitsubishi.startEngine());
    }

    private static void chooseTenRandomMovies()
    {
        for(int i=1; i < 11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    private static Movie randomMovie()
    {
        int randomNumber = (int)(Math.random()*4)+1;
        switch(randomNumber)
        {
            case 1:
                return new Jaws("Jaws");
            case 2:
                return new DieHard("Die Hard");
            case 3:
                return new BeautyAndTheBeast("Beauty and the Beast");
            case 4:
                return new FastAndFurious("Fast and Furious");
        }
        return null;
    }
}
