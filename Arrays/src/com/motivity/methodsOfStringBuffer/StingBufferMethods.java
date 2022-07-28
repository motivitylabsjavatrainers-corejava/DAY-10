package com.motivity.methodsOfStringBuffer;

public class StingBufferMethods {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("GoodMorning");
        int sbLength = sb.length();
        int sbCapacity = sb.capacity();
        System.out.println("String Length of " + sb + " is " + sbLength);
        System.out.println("Capacity of " + sb + " is " + sbCapacity);
        System.out.println("-----------------------------------------------");
        //append()
        StringBuffer s= new StringBuffer("Hello ");
        s.append("World ");
        s.append(2022);
        System.out.println(s);
        System.out.println("--------------------------------------");
        //insert()
        StringBuffer sb1 = new StringBuffer("GoodMorning ");
        sb1.insert(4, " ");
        sb1.insert(sb1.length(), 2022);
        System.out.println(sb1);
        System.out.println("-----------------------------------------");
        //reverse()
        StringBuffer sb2 = new StringBuffer("Hello World");
        System.out.println(sb2.reverse());
        //delete(int startIndex,endIndex)
        StringBuffer sb3 = new StringBuffer("Good Morning");
        System.out.println(sb3.delete(5,12)); //prints Good
        System.out.println("-----------------------------------------");

        //delete(CharAt(int index))
        StringBuffer sb4 = new StringBuffer("Good Morning!");
        System.out.println(sb4.deleteCharAt(12)); //prints Good Morning
        System.out.println("-----------------------------------------------");

        //replace(startIndex,endIndex)
        StringBuffer sb5 = new StringBuffer("Hello World!");
        System.out.println(sb5.replace(6,11,"Earth")); //prints "Hello Earth!"
        System.out.println("------------------------------");
        //void setCharAt(int index, char ch)
        StringBuffer sb6 = new StringBuffer("venuJohn");
        sb6.setCharAt(0,'V');
        System.out.println(sb6);
        System.out.println("------------------------------------");
        //setLength(int newLength)
        StringBuffer sb7 = new StringBuffer("venujohnBalijapelli");
        System.out.println(sb7.toString());

    }

}