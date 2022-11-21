package com.krisha;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //array pf primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        //[23,45,233,543,3]
        System.out.println(arr[3]);

        //input using for loop

//        for (int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }


        // for printing it you can use 3 ways mentione below

//        System.out.println(Arrays.toString(arr));//best one

        //OR
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//          OR

//        for (int j : arr) {//for every element in array, print the element
//            System.out.print(j + " ");// j represents elements of array
//        }



        //arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1] = "vansh";
        System.out.println(Arrays.toString(str));
    }

}
