package com.krisha;

public class SearchAndReturnElements {
    public static void main(String[] args) {
        int[] nums= {1,5,78,96,-8,56,-8,-67};
        int target = 55;
//        int ans = linearSeach(nums, target);
//        System.out.println(ans);


        boolean ans = linearSeach2(nums, target);
        System.out.println(ans);
    }
    //search the target and return the element
    static int linearSeach(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;// because -1 may be in array
    }

    //search the target and return true or false
    static boolean linearSeach2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
