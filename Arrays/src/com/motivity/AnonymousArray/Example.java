package com.motivity.AnonymousArray;

// To demonstrate the way of passing an anonymous array to method

public class Example {

    public static void main(String args[]){
        AnonymousArray(new int[]{55,12,97,3030});//passing anonymous array to method
        }
        //creating a method which receives an array as a parameter
    static void AnonymousArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
