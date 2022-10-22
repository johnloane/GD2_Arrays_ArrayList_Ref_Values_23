package com.dkit.gd2.johnloane.carchallenge;

public class RobinReliant extends Car
{
    private int roadServiceMonths;

    public RobinReliant( int roadServiceMonths)
    {
        super("Robin Reliant", "Small", 3, 3, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate)
    {
        int newSpeed = this.getCurrentSpeed() + rate;
        if(newSpeed == 0)
        {
            stop();
            changeGear(0);
        }
        else if(newSpeed > 0 && newSpeed <= 10)
        {
            changeGear(1);
        }
        else if(newSpeed > 10 && newSpeed <= 20)
        {
            changeGear(2);
        }
        else if(newSpeed > 20 && newSpeed <= 30)
        {
            changeGear(3);
        }
        else
        {
            changeGear(4);
        }

        if(newSpeed > 0)
        {
            changeVelocity(newSpeed, this.getCurrentDirection());
        }
    }
}
