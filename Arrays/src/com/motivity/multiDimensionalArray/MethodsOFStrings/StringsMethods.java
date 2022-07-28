package com.motivity.MethodsOFStrings;

public class StringsMethods {
    public static void main(String[] args) {
        String s= "helloeveryone";

        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "+ s.charAt(3));

        // Return the substring from the ith index character to end of string

        System.out.println("Substring " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring = " + s.substring(2,5));

        // Concatenates string2 to the end of string1.
        String s1 = "my name is";
        String s2 = "venukumar";
        System.out.println("Concatenated string = " +s1.concat(s2));


        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "my goal is to become a cricketer";
        System.out.println("Index of Share " +s4.indexOf("become"));

        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a = " +s4.indexOf('a',3));


        // Checking equality of Strings
        Boolean out = "manoj".equals("Manoj");//case matters here it returns false
        System.out.println("Checking Equality " + out);
        out = "bunty".equals("bunty");                  //returns true
        System.out.println("Checking Equality " + out);

        out = "ManJa".equalsIgnoreCase("manja ");//case ignores here
        System.out.println("Checking Equality " + out);

        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "iAmGodBoy";
        System.out.println("Changing to lower Case " +word1.toLowerCase());

        // Converting cases
        String word2 = "bhooja";
        System.out.println("Changing to UPPER Case " +word2.toUpperCase());

        // Trimming the word
        String word4 = " my fav cricketer is DK ";//trim only spaces of first and last
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "goodmorninggoodafternoon";
        System.out.println("Original String " + str1);
        String str2 = "goodmorninggoodafternoon".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);

        String k="Bunty";
        System.out.println(k.startsWith("B"));// returns true
        System.out.println(k.endsWith("n"));// returns false as it ends with y

        int a=10;
        String z=String.valueOf(a);
        System.out.println(z+10);//returns 1010 i.e converts int into String

    }
}


