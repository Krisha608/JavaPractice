package com.krisha;
import java.util.Scanner;
public class Sum_With_Function {
    public static void main(String[] args) {
//        sum(); //function call

//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }


    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    //return the value
//    static int sum2(){
//        Scanner input = new Scanner(System.in);
//        int num1,num2,sum; // define here so no need to define anywhere
//
//        System.out.print("enter number 1: ");
//        num1 = input.nextInt();
//        System.out.print("enter number 2: ");
//        num2 = input.nextInt();
//
//        sum = num1 + num2;
//        return sum; // whenever return hits its done means no statement will execute after return
//    }


    //Simple use of the function with no return type means use void
//    static void sum(){
//        Scanner input = new Scanner(System.in);
//        int num1,num2,sum;
//
//        System.out.print("enter number 1: ");
//        num1 = input.nextInt();
//        System.out.print("enter number 2: ");
//        num2 = input.nextInt();
//
//        sum = num1 + num2;
//        System.out.println("The sum = " + sum);
//    }


    /*
        return_type name (arguments){
        //body
        return statement;
        }
    */
}

