package com.company;
import java.util.*;

public class MergeaSort{
    public static void main(String[] args) {
        int[] arr = {1,7,9,3,2,10};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int[] finalarr = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                finalarr[k] = right[j];
                j++;
            }
            else{
            finalarr[k]=left[i];
            i++;
        }
        k++;
    }
        while(i<left.length){
            finalarr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            finalarr[k]=right[j];
            j++;
            k++;
        }
        return finalarr;
    }
}
