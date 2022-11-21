package com.krisha;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(4);

//        list.add(67);
//        list.add(78);//you can pass as many as you want
//        list.add(61);
//        list.add(63);
//        list.add(52);
//        list.add(23);
//
//        System.out.println(list.contains(63));
//
//        System.out.println(list);
//        list.set(0,99); // update elements
//
//        list.remove(2);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        System.out.println(list);

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here,list[index] is not work here
        }

    }
}
// idea is that what if you don't know the size of the variable

