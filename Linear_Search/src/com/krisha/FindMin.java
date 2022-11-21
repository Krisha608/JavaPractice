package com.krisha;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {18, 12, -7, 3, 14, 28};
        System.out.println(min(nums));
    }

    //assume arr.length!=0
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
