package com.krisha;

public class Conditions {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");
        /*
        SYNTAX OF IF STATEMENTS
        if(boolean expression T or F){
            //body
        } else{
            //do this
        }
         */
//        int salary = 25400;
//        if(salary > 10000){
//            salary = salary + 2000;
//        }else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //multiple if-else statements
        int salary = 15400; // try for 5400 and 25400 also for better idea

        if(salary < 10000){
            salary += 2000;
        }else if(salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
