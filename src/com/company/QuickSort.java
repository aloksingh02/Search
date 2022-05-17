package com.company;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,8,2,7,10};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        while(start<=end) {
            while (nums[start] < nums[mid]) {
                start++;
            }
            while (nums[end] > nums[mid]) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quick(nums,low,end);
        quick(nums,start,high);

    }
}
