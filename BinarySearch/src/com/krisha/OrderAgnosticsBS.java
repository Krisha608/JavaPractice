package com.krisha;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
//        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};//acending order
        int[] arr = {22,18,15,11,9,7,6,5,0,-5,-9};//decending order
        int target = 11;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
//similar to
        /*
        boolean isAsc;
        if(arr[start] < arr[end]){
        isAsc = true;
        }
        else{
        isAsc =false;
        }
         */