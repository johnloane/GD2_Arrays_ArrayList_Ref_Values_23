package com.dkit.gd2.johnloane.interfaces;

public class MobilePhone implements ITelephone
{
    private String myNumber;
    private boolean isRinging = false;
    private boolean isOn = false;

    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn()
    {
        isOn = true;
        System.out.println("Mobile phone turned on");
    }

    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber)
    {
        if(phoneNumber.equals(this.myNumber) && isOn)
        {
            isRinging = true;
            System.out.println("Phone is ringing");
        }
        else
        {
            isRinging = false;
            System.out.println("Mobile phone not on or wrong number");
        }
        return isRinging;


    }

    @Override
    public void dial(String phoneNumber)
    {
        if (isOn)
        {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else
        {
            System.out.println("Mobile phone is turned off");
        }
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
