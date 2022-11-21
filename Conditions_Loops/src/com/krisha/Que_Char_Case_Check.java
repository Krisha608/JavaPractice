package com.krisha;
//Q: for checking that charcter is uppper case or lower case
import java.util.Scanner;
public class Que_Char_Case_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*there is no such thing that input.nextchar()
        so we have to take string and then choose the first letter of string
         */
        // trim remove white space from start and end

        //charAt is that give the letter of this index and charAt return the char type
//        String name = "Krisha";
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
        //only true when both conditions are true for example:-
//        int a = 10;
//        int b = 20;
//        if (a == 10 && b ==20){
//            System.out.println("both true");
//        }
        //or(!!) there is true eithere one of this is true

        //solution
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }

    }
}
