package com.dkit.gd2.johnloane;

import java.util.Arrays;

public class ValuesAndReferences
{
    public static void main(String[] args)
    {
        demoValueType();
        demoReferenceType();

        int[] anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(anotherArray);

        System.out.println(Arrays.toString(anotherArray));
        int myValue = 10;
        System.out.println("myValue in main is " + myValue);
        testScope();



    }

    private static void testScope()
    {
        int myValue = 100;
        System.out.println("myValue in main is " + myValue);
    }

    private static void modifyArray(int[] anotherArray)
    {
        anotherArray[0] = 999;
        anotherArray = new int[]{1,2,3,4,5};
    }

    private static void demoReferenceType()
    {
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray= " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 77;
        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray= " + Arrays.toString(anotherIntArray));
    }

    private static void demoValueType()
    {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);
    }
}
