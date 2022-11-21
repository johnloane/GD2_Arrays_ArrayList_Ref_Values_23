package com.dkit.gd2.johnloane.interfaces;

import java.util.Comparator;

public class SeatPriceComparator implements Comparator<Seat>
{
    @Override
    public int compare(Seat seat1, Seat seat2)
    {
        if(seat1.getPrice() < seat2.getPrice())
        {
            return -1;
        }
        else if(seat1.getPrice() > seat2.getPrice())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
