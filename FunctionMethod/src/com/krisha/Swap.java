package com.krisha;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope only.
    }
}
//not swap a and b