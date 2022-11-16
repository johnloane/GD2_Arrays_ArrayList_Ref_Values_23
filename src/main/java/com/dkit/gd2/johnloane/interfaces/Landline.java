package com.dkit.gd2.johnloane.interfaces;

public class Landline implements ITelephone
{
    private String myNumber;
    private boolean isRinging;

    public Landline(String myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn()
    {
        System.out.println("No action taken, landline has no power button");
    }

    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answering the landline");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber)
    {
        if(phoneNumber.equals(myNumber))
        {
            isRinging = true;
            System.out.println("Landline ringing");
        }
        else
        {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(String phoneNumber)
    {
        System.out.println("Now ringing " + phoneNumber + " on landline");
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
