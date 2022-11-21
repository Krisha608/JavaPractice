package com.krisha;
import java.util.Scanner;
public class AS_Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
