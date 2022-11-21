package com.krisha;
import java.util.Scanner;

// print all 3 digit armstrong numbers
public class Que_Armstrong_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(isArmstrong(n)); // to check that is number is armstrong or not
        
        //for printing all 3 digit armstrong numbers
        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n /10;
            sum = sum +rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
/*take every digit if it is 3 digit number then
simply seprate all digit and cube them in individuals
then calculate sum of this and then check that if sum is equal to original number

 */

