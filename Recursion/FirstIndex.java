package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class FirstIndex {
    //1. You are given a number n, representing the count of elements.
    //2. You are given n numbers.
    //3. You are given a number x.
    //4. You are required to find the first index at which x occurs in array a.
    //5. If x exists in array, print the first index where it is found otherwise print -1.
    public static int firstindex(int[] arr , int idx , int x)
    {
        if(idx >= arr.length)
        {
            return -1;
        }
        else if (arr[idx] == x)
        {
            return idx;
        }
        else {
          int value =    firstindex(arr , idx +1 , x);
          return value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ;i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of x :");
        int x = sc.nextInt();

       int temp = firstindex(arr , 0 , x );
       System.out.println(temp);
    }
}
