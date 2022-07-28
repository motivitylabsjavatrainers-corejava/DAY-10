package com.motivity;

import java.util.StringTokenizer;

public class StringTokenizerMethods {
        public static void main(String args[])
        {
            // Constructor 1
            System.out.println("Using Constructor 1 - ");

            // Creating object of class inside main() method
            StringTokenizer st1 = new StringTokenizer(
                    "My Name is Venu Kumar", " ");
            // Condition holds true till there is single token
            // remaining using hasMoreTokens() method
            while (st1.hasMoreTokens())
                // Getting next tokens
                System.out.println(st1.nextToken());
            // Constructor 2
            System.out.println("Using Constructor 2 - ");
            StringTokenizer st2 = new StringTokenizer(
                    "Iam : From : Dharmapuri", " :");
            // If tokens are present
            while (st2.hasMoreTokens())
                System.out.println(st2.nextToken());
            // Constructor 3
            System.out.println("Using Constructor 3 - ");

            StringTokenizer st3 = new StringTokenizer(
                    "Yes: Iam From : Dharmapuri", " :", true);
            while (st3.hasMoreTokens())
                System.out.println(st3.nextToken());
        }

}
