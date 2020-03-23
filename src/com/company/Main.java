package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinInValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinInValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        int myMaxIntTest = 217483647;
        System.out.println("Busted Min value =" +( myMaxIntTest + 1));
        System.out.println("Busted Min value =" +( myMaxIntTest - 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value =" + myMinByteValue);
        System.out.println("Byte Maximum value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value =" + myMinShortValue);
        System.out.println("Short Maximum value =" + myMaxShortValue);
        
        long myLongValue =100L;
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value =" + myMinLongValue);
        System.out.println("Long Maximum value =" + myMaxLongValue);
        int myTotal = (myMinInValue / 2);
        byte MyNewByteValue = (byte) (myMaxByteValue /2);
        short myShortValue = (short) (myMinShortValue /2);

        // Challenge primitive
        byte bigNumber = 127;
        short largerNumber = 32;
        int smallNumber = 21;
        long longTotal = 50000 + 10 * (bigNumber + largerNumber +smallNumber);
        System.out.println(longTotal);

    }
}
