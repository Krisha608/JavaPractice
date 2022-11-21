package com.krisha;
//Q: counts that howmany times particular number is occuring like in this howmany times 5 will occur
import java.util.Scanner;
public class Que_Counts_Nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10; // modulo with 10 gives last digit of num you enter
            if(rem == 5){
                count++;
            }
            n = n / 10;// reduce number like 56231555 reduced like 5623155 // remove last digit from number
        }
        System.out.println(count);
    }
}
