package com.dkit.gd2.johnloane.carchallenge;

public class Vehicle
{
    private String name;
    private String size;

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, String size)
    {
        this.name = name;
        this.size = size;

        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("Vehicle.steep(): Steering at " + currentDirection + " degrees");
    }

    public void move(int speed, int direction)
    {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public String getName()
    {
        return name;
    }

    public String getSize()
    {
        return size;
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public int getCurrentDirection()
    {
        return currentDirection;
    }

    public void stop()
    {
        this.currentSpeed = 0;
    }
}
