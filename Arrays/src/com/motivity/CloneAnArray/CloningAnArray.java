package com.motivity.CloneAnArray;
// Program to clone the array
public class CloningAnArray {
    public static void main(String args[]){
            int arr[]={76,5,7,50};
            System.out.println("Printing original array:");
            for(int i:arr)
                System.out.println(i);

            System.out.println("Printing clone of the array:");
            int cloneArray[]=arr.clone();
            for(int i:cloneArray)
                System.out.println(i);

            System.out.println("if both are equal returns true else returns false");
            System.out.println(arr==cloneArray);

        }
}
