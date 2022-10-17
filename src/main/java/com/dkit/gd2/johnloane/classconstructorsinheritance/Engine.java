package com.dkit.gd2.johnloane.classconstructorsinheritance;

public class Engine
{
    private String manufacturer;
    private String fuelType;
    private int horsePower;
    private double litres;

    @Override
    public String toString()
    {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", horsePower=" + horsePower +
                ", litres=" + litres +
                '}';
    }
}
