package com.dkit.gd2.johnloane.calculator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CalculatorTest
{

    @Test
    public void addThreeNumbers()
    {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(7.0);
        numbers.add(4.0);
        double expectedResult = 21.0;
        assertEquals(expectedResult, Calculator.add(numbers), 0.0001);
    }

    @Test
    public void addPositiveAndNegative()
    {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(7.0);
        numbers.add(-7.0);
        double expectedResult = 0.0;
        assertEquals(expectedResult, Calculator.add(numbers), 0.0001);
    }

    @Test
    public void addDoubles()
    {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(7.3);
        numbers.add(10.7);
        double expectedResult = 18.0;
        assertEquals(expectedResult, Calculator.add(numbers), 0.0001);
    }

    @Test
    public void addZeros()
    {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(0.0);
        numbers.add(0.0);
        double expectedResult = 0.0;
        assertEquals(expectedResult, Calculator.add(numbers), 0.0001);
    }

    @Test
    public void subtract()
    {
        fail("Not implemented yet");
    }

    @Test
    public void multiply()
    {
        fail("Not implemented yet");
    }

    @Test
    public void divide()
    {
        fail("Not implemented yet");
    }

    @Test
    public void modulus()
    {
        fail("Not implemented yet");
    }
}