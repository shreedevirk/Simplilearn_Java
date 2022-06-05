package com.simplilearn.datatypedemo.package1;

import java.util.Arrays;
public class ExponentilSearch {
    public static  void main(String[] args){
        int[] arr = {6,12,18,24,32};
        int length= arr.length;
        int value = 32;
        int outcome = exponentialSearch(arr,length,value);
        if(outcome<0){
            System.out.println( "Element is not present in the array");
        }
        else 
        {
            System.out.println( "Element is  present in the array at index :"+outcome);
        }
    }
    public static int exponentialSearch(int[] arr ,int length, int value ){
        if(arr[0]==value){
            return 0;
        }
        int i=1;
        while(i<length && arr[i]<=value)//(1<5 && 12<=18) (2<5 && 18<=18) (4<5 && 32<=18)X
        {
            i=i*2;//1*2=2  2*2=4
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value); //(arr,2,2,18)
    }
}

