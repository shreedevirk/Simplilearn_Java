package com.simplilearn.datatypedemo.package1;

public class Trythrows
{
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        int[] array = new int[3];//
            array[7] = 3;
            System.out.println("The array is of size " + array.length);
    }
}

