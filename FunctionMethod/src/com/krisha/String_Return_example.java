package com.krisha;
import java.util.Scanner;

public class String_Return_example {

////        String message = greet();
////        System.out.println(message);
//
//
//        String personalised = myGreet("Krisha Patel");
//        System.out.println(personalised);
//    }
//
////      static String greet(){
////          String greeting = "How are you?";
////          return greeting;
////      }
//
//
//        static String myGreet(String name) {
//            String message = "Hello " + name;
//            return message;
//        }
//}
// let's say you want to take input for ypurself then you want to do this

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String naam = input.next();
                String personalised = myGreet(naam);
                System.out.println(personalised);

            }

            static String myGreet(String name) {
                String message = "Hello " + name;
                return message;
            }
        }

