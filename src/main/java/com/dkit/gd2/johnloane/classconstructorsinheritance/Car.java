package com.dkit.gd2.johnloane.classconstructorsinheritance;

import java.util.ArrayList;
import java.util.Locale;

public class Car
{
    private Wheel wheel;
    private int doors;
    private String make;
    private int seats;
    private String colour;
    private Engine engine;
    private int year;
    private int mileage;
    private String transmission;
    private String exhaustType;
    private int numberOfExhausts;
    private double price;
    private String model;
    private ArrayList<String> accessories;
    private double weightInKg;
    private boolean leftHandDrive;
    private double bootSize;
    private boolean selfDriving;

    public Car(Wheel wheel, int doors, String make, int seats, String colour, Engine engine, int year, int mileage, String transmission, String exhaustType, int numberOfExhausts, double price, String model, ArrayList<String> accessories, double weightInKg, boolean leftHandDrive, double bootSize, boolean selfDriving)
    {
        this.wheel = wheel;
        this.doors = doors;
        this.make = make;
        this.seats = seats;
        this.colour = colour;
        this.engine = engine;
        this.year = year;
        this.mileage = mileage;
        this.transmission = transmission;
        this.exhaustType = exhaustType;
        this.numberOfExhausts = numberOfExhausts;
        this.price = price;
        this.model = model;
        this.accessories = accessories;
        this.weightInKg = weightInKg;
        this.leftHandDrive = leftHandDrive;
        this.bootSize = bootSize;
        this.selfDriving = selfDriving;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("tacoma") || validModel.equals("civic") || validModel.equals("charger"))
        {
            this.model = model;
        }
        else
        {
            this.model = "Unknown";
        }
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "wheel=" + wheel +
                ", doors=" + doors +
                ", make='" + make + '\'' +
                ", seats=" + seats +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", mileage=" + mileage +
                ", transmission='" + transmission + '\'' +
                ", exhaustType='" + exhaustType + '\'' +
                ", numberOfExhausts=" + numberOfExhausts +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", accessories=" + accessories +
                ", weightInKg=" + weightInKg +
                ", leftHandDrive=" + leftHandDrive +
                ", bootSize=" + bootSize +
                ", selfDriving=" + selfDriving +
                '}';
    }
}
