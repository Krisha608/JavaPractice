package com.krisha;
import java.util.Scanner;

public class BasicSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();

//        if(fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }



//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("red sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//
//        }
        /*for better look we can modifiy this by move cursor on switch keyword
        and then press alt+enter the choose   replaced with enhanced statement
        then the code will look like below
         */

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("red sweet fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }



//        int day = input.nextInt();
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thrusday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }


        //not use break
//        int day = input.nextInt();
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//        }

        //OR this code more prettier

//        int day = input.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7 -> System.out.println("Weekends");
//        }

    }
}
