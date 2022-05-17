package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(searchInRange(arr,3,1,4));
    }
    public static int searchInRange(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
