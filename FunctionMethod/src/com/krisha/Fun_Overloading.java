package com.krisha;

public class Fun_Overloading {
    public static void main(String[] args) {
        fun(36);
        fun("krisha");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
//means two or more function are exists if the parameters are different