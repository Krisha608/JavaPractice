package com.krisha;
import java.util.Arrays;
public class Variable_Length_Args {
    public static void main(String[] args) {
//        fun(2,3,4,5,56,78,55,22);
//        multiple(2, 45, "krisha","vansh","manish","vaishali");
//        int ans = sum(7,10); //you can add c value also in same
//        System.out.println(ans);
        demo(2,5,7,5);
        demo("krisha", "vansh");
//        demo(); you can not do this you have to pass arguments in the overlapping
    }

    static void multiple(int a, int b, String  ...v){
        System.out.println("first one");
        System.out.println(a);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String  ...v){
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }
}
//when we do not know howmany inputs we are giving


