package com.krisha;

public class SearchAndReturnIndex {
    public static void main(String[] args) {
        int[] nums = {1,8,6,89,78,52,-86,34,-76};
        int target = 52;
        //int target = 5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    //search in the array:return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
