package com.dkit.gd2.johnloane.carchallenge;

public class Main
{
    public static void main(String[] args)
    {
        //Challenge
        //Start with a base class of a Vehicle, and then create a Car class that
        //inherits from this base class. Then create another class, a specific
        //type of car that inherits from the Car class.
        //You should be able to handle steering, changing gears, and moving
        //You will need decide on state and behaviours(attributes and methods)
        //For the specific type of car you will need to add something specific
        RobinReliant myCar = new RobinReliant(12);
        myCar.steer(45);
        myCar.accelerate(30);
        myCar.accelerate(20);
        myCar.accelerate(-42);
    }
}
