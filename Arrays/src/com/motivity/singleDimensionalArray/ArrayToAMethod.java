package com.motivity.singleDimensionalArray;
// To demonstrate the way of passing an array to method.
public class ArrayToAMethod {
    //creating a method which receives an array as a parameter
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];
        System.out.println("The least element in an array is : " +min);
    }

    public static void main(String args[]) {
        int a[] = {67, 55, 2, 8};    //declaring and initializing an array
        min(a);      //passing array to method
    }
}

