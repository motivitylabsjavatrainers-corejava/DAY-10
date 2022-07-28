package com.motivity.multiDimensionalArray;

public class TwoDimensionalArrayExample {
    public static void main(String[] args)
    {

        int[][] arr = { { 1, 2 ,3}, { 3, 4 ,7} };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j <3; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
    }
}
