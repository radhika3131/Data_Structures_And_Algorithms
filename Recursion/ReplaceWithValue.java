package com.dataStructures.Recursion;

import java.util.Scanner;

public class ReplaceWithValue {
    public static int[] replace(int[] arr , int element , int idx , int value)
    {
        if(arr.length == idx)
        {
           int[] newArr = new int[arr.length];
           return newArr;
        }

        if(arr[idx] == element)
        {
            arr[idx] = value;
        }

       int[] newArr =  replace(arr , element , idx + 1 , value);
        if(arr[idx] == element)
        {
            arr[idx] = value;
        }else {
            newArr[idx] = arr[idx];
        }

        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the values in the array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // element is basically the value that we have to search
        int x = sc.nextInt();
        // this is the value with which we have replace x
        int replacewith = sc.nextInt();
        int[] iarr = replace(arr, x, 0 , replacewith);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        System.out.println("values after being replaced");
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
}
