package com.practice.java;

public class TypeCasting {
    /*
     Type Conversion.
     */
    public static void main(String[] args) {
        /*
        implicit type casting.
         */
        byte age;
        age = 35;
        int ageValue ;
        ageValue = age;

        /*
        Explicit type casting
         */
        float value;
        value = 358.76f;
        int intValue;
        intValue = (int) value;
        System.out.println("IntValue data type: "+ intValue);

        ageValue = 130;
        age = (byte)ageValue;
        System.out.println("Age: " + age);

    }
}
