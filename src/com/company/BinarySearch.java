package com.company;
import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,10};
        System.out.println(binarySearch(arr,1));
    }
    public static int binarySearch(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
