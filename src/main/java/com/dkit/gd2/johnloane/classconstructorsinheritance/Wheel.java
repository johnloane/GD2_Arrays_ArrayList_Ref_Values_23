package com.dkit.gd2.johnloane.classconstructorsinheritance;

public class Wheel
{
    private int radius;
    private int width;
    private boolean steelOrAlloy;
    private Tyre tyre;

    @Override
    public String toString()
    {
        return "Wheel{" +
                "radius=" + radius +
                ", width=" + width +
                ", steelOrAlloy=" + steelOrAlloy +
                ", tyre=" + tyre +
                '}';
    }
}
