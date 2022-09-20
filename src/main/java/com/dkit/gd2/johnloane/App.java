package com.dkit.gd2.johnloane;

import java.util.Scanner;

/**
 * Arrays, ArrayLists, Values and References
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main( String[] args )
    {
        //int[] myIntegers = new int[10];
        //System.out.println(myIntegers[0]);

        //populateArray(myIntegers);
        //printArray(myIntegers);
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is: " + getAverage(myIntegers));




    }

    private static double getAverage(int[] myIntegers)
    {
        int sum = 0;
        for(int num : myIntegers)
        {
            sum += num;
        }
        return (double)sum / (double)myIntegers.length;
    }

    private static int[] getIntegers(int numberOfNumbers)
    {
        System.out.println("Please enter " + numberOfNumbers + " integer values");
        int[] values = new int[numberOfNumbers];

        for(int i=0; i < values.length; i++)
        {
            values[i] = keyboard.nextInt();
        }
        return values;
    }

    private static void printArray(int[] myIntegers)
    {
        for(int number : myIntegers)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void populateArray(int[] myIntegers)
    {
        for(int i = 0; i < 10; i++)
        {
            myIntegers[i] = i+1;
        }
    }
}
