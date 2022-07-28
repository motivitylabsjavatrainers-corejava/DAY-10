package com.motivity.ReturningAnArrayToMethod;

//Program to return an array from the method
public class ReturnArray {
    public static void main(String args[]){
      //calling method which returns an array
            int arr[]=get();
            for(int i:arr)
                System.out.println(i);
        }
    //creating method which returns an array
        static int[] get(){
        return new int[]{10,30,50,90,60};
    }

}
