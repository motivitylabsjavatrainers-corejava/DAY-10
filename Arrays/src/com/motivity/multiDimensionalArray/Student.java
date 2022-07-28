package com.motivity.multiDimensionalArray;

// Java program to illustrate creating
//  an array of objects

public class Student
{
    public String name;
    Student(String name)
    {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}

// Elements of the array are objects of a class Student.
 class Main
{
    public static void main (String[] args)
    {
        // declares an Array and initializing  the elements of the array
        Student[] s = new Student[]{new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")}; // Array of 5 students created but No students are there in the array

        // accessing the elements of the specified array
        for(Student m:s){
            System.out.println(m);
        }
    }
}
