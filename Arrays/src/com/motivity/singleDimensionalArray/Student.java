package com.motivity.singleDimensionalArray;

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}
    class Main {
        public static void main(String[] args)
        {
            // declares an Array of integers.
            Student[] arr;

            // allocating memory for 5 objects of type Student.
            arr = new Student[5];

            // initializing elements of the array
            arr[0] = new Student(1, "venu");
            arr[1] = new Student(2, "satya");
            arr[2] = new Student(3, "nikhil");
            arr[3] = new Student(4, "hari");
            arr[4] = new Student(5, "sandeep");

            // accessing the elements of the specified array
            for (int i = 0; i < arr.length; i++)
                System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
        }
    }