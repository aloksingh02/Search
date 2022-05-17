package com.company;
import java.util.*;

public class _SelectionSort_{
    public static void main(String[] args) {
        int[] arr = {5,2,7,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] nums){
        for(int i=0;i< nums.length;i++){
            int end = nums.length-i-1;
            int maxIndexX = maxIndex(nums,0,end);
            swap(nums,maxIndexX,end);
        }
    }
    public static int maxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
