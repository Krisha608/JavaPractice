package com.krisha;
//search for 3 in index 1 to 4
public class SearchInRange {
    public static void  main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(search(nums, target, 1, 4));
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if(target == element){
                return index;
            }
        }
        return -1;
    }
}
