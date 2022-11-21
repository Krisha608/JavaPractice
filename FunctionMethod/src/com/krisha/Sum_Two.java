package com.krisha;
import java.util.Scanner;
public class Sum_Two {
    public static void main(String[] args) {
        //Q: take input of two number and print the sum
        Scanner input = new Scanner(System.in);
        int num1,num2,sum; // define here so no need to define anywhere

        System.out.print("enter number 1: ");
        num1 = input.nextInt();
        System.out.print("enter number 2: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
