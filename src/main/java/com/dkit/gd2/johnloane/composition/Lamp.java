package com.dkit.gd2.johnloane.composition;

public class Lamp
{
    private String style;
    private boolean On;
    private int wattage;

    public Lamp(String style, boolean on, int wattage)
    {
        this.style = style;
        On = on;
        this.wattage = wattage;
    }

    public String getStyle()
    {
        return style;
    }

    public boolean isOn()
    {
        return On;
    }

    public int getWattage()
    {
        return wattage;
    }

    public void turnOn()
    {
        System.out.println("Lamp -> Turning on");
        this.On = true;
    }
}
