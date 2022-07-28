package com.motivity.FindClassNameOfArray;

    // Program to get the class name of array
public class ClassNameOfArray {
        public static void main(String args[]){

            int arr[]={10,47,25};
          //getting the class name of  array
            Class c=arr.getClass();
            String name=c.getName();
        //printing the class name of  array
            System.out.println(name);

        }
}
