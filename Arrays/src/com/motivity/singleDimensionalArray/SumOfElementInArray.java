package com.motivity.singleDimensionalArray;

// Java program to demonstrate
// passing of array to method

public class SumOfElementInArray {
    static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        sum(arr);
    }

}