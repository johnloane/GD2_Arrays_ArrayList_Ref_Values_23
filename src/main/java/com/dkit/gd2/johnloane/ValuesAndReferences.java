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

        /*
        Create a program using arrays that sorts a list of integers in descending order.
        Descending order is highest value to lowest.
        [1,2,3,4,5] -> [5,4,3,2,1]
        Set up the program so that the numbers are read in from the keyboard.
        Implement the following methods - getIntegers, printArray and sortIntegers
        getIntegers returns an array of integers entered via the keyboard
        printArray prints the contents of an array
        sortIntegers will sort the array and return a new array with the sorted values
        You will need to figure out how to copy the array elements from the passed array to the new array, sort them and return the new sorted array
         */



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
