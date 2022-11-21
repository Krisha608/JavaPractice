package com.krisha;

public class Main {

    public static void main(String[] args) {
        //Q: store a roll no
        int a  = 19;

        //Q: store a person's name
        String name = "krisha patel";

        //Q: store 5 roll no
        //SYNTAX OF ARRAYS
        //datatype[] variable_name = new datatype[size];
        int[] rollno = new int[5];
        //or directly
        int[] rollno2 = {22,25,56,24,54,85,66};

        int [] rollno1; // declaration of arrays. rollno is defined in the stack
        rollno1 = new int[5]; //initialisation: actually here object is being created in the memory(heap)
        System.out.println(rollno2[3]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
//collections of datatypes
//all the type of data of array should be same datatype
//Dynamic memory allocation : memory allocation at run time this is called dynamic memory allocation
// array object are in heap
//heap objects are not continuos
//arrays objects in java may not be contineuos beacause it depends on JVM
//new is used for to create an object
// null is nothing but variable without any datatype only assign to non primitives
//you can not assigned to primitives
//for example you can do that like : String str = null;
//but you can not do like this : int a = null;
//primitves are stored in stack memory but all the other object is store in the heap memory
