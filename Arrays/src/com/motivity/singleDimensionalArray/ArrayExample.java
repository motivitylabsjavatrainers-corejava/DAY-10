package com.motivity.singleDimensionalArray;
//Java Program to illustrate how to declare, instantiate, initialize

public class ArrayExample {
    public static void main(String[] args) {

        int arr[]=new int[7];//declaration and instantiation
        arr[0]=10;//initialization
        arr[1]=20;
        arr[2]=70;
        arr[3]=40;
        arr[4]=50;
        arr[5]=60;
        arr[6]=70;
     //traversing array
        for(int i=0;i<arr.length;i++)   //length is the property of array
            System.out.println(arr[i]);
    }

}