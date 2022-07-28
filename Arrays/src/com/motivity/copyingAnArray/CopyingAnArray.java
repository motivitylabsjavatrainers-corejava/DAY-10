package com.motivity.copyingAnArray;
// Program to copy a source array into a destination array in Java
public class CopyingAnArray {
    public static void main(String[] args) {
            //declaring a source array
            char[] copyFrom = { 'a', 'b', 'h', 'o', 'n', 'e', 'y','b', 'e', 'e', 't', 'k', 'z' };
            //declaring a destination array
            char[] copyTo = new char[8];
            //copying array using System.arraycopy() method
            System.arraycopy(copyFrom, 2, copyTo, 0, 8);
            //printing the destination array
            System.out.println(String.valueOf(copyTo));
        }
    }


