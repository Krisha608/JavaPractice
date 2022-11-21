package com.krisha;
import java.util.Scanner;
//Q: find the largest of this 3 numbers
public class Que_Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if(b > max){
//            max  = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

        //another way to solve this problem
//        int max = 0;
//        if(a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        //using Math function
//        System.out.println(Math.max(56,89));

        // solution
        int max = Math.max(c,Math.max(a, b));
        System.out.println(max);
    }
}
