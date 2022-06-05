package com.simplilearn.datatypedemo.package1;

public class BinarySearch {
    public static  void main(String[] args){
        int[] arr = {2,4,6,8,10};
        int key = 1;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length){
        int midValue = (start+length)/2;//0+6/2=3
        System.out.println("The mid value is: "+midValue);
        while(start<=length)//0<5 ==true
        {
            if(arr[midValue]<key)//12<50
            {
                System.out.println(arr[midValue]<key);
                start = midValue + 1;//3+1=4
            } 
            else if(arr[midValue]==key)//12==12
            {
                System.out.println("Element is found at index :"+midValue);
                break;
            }
            else {
                length=midValue-1;//4-1=3
            }
            midValue = (start+length)/2;//3+5/2=4
        }
        if(start>length){
            System.out.println("Element is not found");
        }
    }
}

