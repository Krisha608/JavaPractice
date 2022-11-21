package com.krisha;

public class Shadowing {
    static int x = 90;//higher level scope will hidden
    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 40;//lower level is overlap the higher one
        //int x;
//        System.out.println(x); error scope will begin when value is initialised
        //x = 40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//using two varible with the same name within the scope that overlaps
