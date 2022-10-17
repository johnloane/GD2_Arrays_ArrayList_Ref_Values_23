package com.dkit.gd2.johnloane.calculator;

import java.util.ArrayList;

public class Calculator
{
    public static double add(ArrayList<Double> numbersToAdd)
    {
        double result = 0;
        for(Double number : numbersToAdd)
        {
            result += number;
        }
        return result;
    }

    public static double subtract(ArrayList<Double> numbersToAdd)
    {
        return 0.0;
    }

    public static double multiply(ArrayList<Double> numbersToAdd)
    {
        return 0.0;
    }

    public static double divide(ArrayList<Double> numbersToAdd)
    {
        return 0.0;
    }

    public static int modulus(int num1, int num2)
    {
        return 0;
    }



}
