package com.krisha;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //individual array size is different like this:
//        int[][] arr = {
//                {1, 2, 3},//0th index
//                {4, 5},//1st index
//                {6, 7, 8, 9}//2nd index -> arr2[2] = {6,7,8,9}
//        };

        // OR

        int[][] arr = new int[3][3];//[rows][column] rows is necessory column is not necessory


        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        // OR you can do this

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // enhanced for lopp is more easy
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
//array of arrays

