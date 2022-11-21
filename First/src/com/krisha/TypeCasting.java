package com.krisha;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // left > right
//        float num = input.nextFloat();
//        System.out.println(num);

        // Type Casting == bigger no to smaller
//        int num = (int)67.56f;
//        System.out.println(num);


        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); //257 % 256 = 1


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//        System.out.println(d);


//        byte b = 50;
//        b = b * 2; // error


        //Unicode value
//        int number = 'A';
//        System.out.println(number);

        // int * float
//        System.out.println(3 * 5.6);
        //int * int
//        System.out.println(8*5);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b)); /// float
        System.out.println((i / c)); ///int
        System.out.println((d * s)); /// double
        System.out.println(result); /// float + int  - double = double



    }
}
