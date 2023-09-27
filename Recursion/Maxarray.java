package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class Maxarray {
    public static int  Max(int[] arr , int idx)
    {
        if(idx >= arr.length)
        {
            return Integer.MIN_VALUE ;
        }

        int val = Max(arr , idx+1);
        return Math.max(arr[idx] , val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ;i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp = Max( arr , 0);
        System.out.println(temp);

    }
}
