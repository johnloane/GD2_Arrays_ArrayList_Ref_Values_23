package com.dkit.gd2.johnloane.staticexample;

public class DKITModule
{
    private String name;
    private int mark;

    public DKITModule(String name, int mark)
    {
        this.name = name;
        this.mark = mark;
    }

    public String getName()
    {
        return name;
    }

    public int getMark()
    {
        return mark;
    }

    @Override
    public String toString()
    {
        return "DKITModule{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
