package com.krisha;
//where we can access our variable
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Krisha";

        {
            a = 79;// you can not initialised it again already initialised outside the block in the same method
            System.out.println(a);
            int c = 99;
            name = "Vansh";
            System.out.println(name);
            //value initialised in this block,will remain in this block
        }
        System.out.println(a);
        //can not use outside the block  for example c
        System.out.println(name);

        //scoping in for loop
        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
/* anything initialised outside the block can be used inside the block,
but anything initialised inside the block can not be used outside

anything initialised outside the block can not be again initialised inside the block
but anything initialised inside the block can be initialised again outside the block
 */

