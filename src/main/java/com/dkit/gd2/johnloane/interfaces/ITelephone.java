package com.dkit.gd2.johnloane.interfaces;

public interface ITelephone
{
    void powerOn();
    void answer();
    boolean callPhone(String phoneNumber);
    void dial(String phoneNumber);
    boolean isRinging();
}
