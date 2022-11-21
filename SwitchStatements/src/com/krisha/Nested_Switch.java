package com.krisha;
import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String  depart = input.next();

//        switch (empID){
//            case 1:
//                System.out.println("KRISHA");
//                break;
//            case 2:
//                System.out.println("VANSH");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (depart){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("NO department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct empID");
//        }

        //Enhanced way will looklike

        switch (empID) {
            case 1 -> System.out.println("KRISHA");
            case 2 -> System.out.println("VANSH");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (depart) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("NO department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }
    }
}
