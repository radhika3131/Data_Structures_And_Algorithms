package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class Displayarray {
    public static void display(int[] arr , int idx)
    {
        if(idx == arr.length)
        {
            return ;
        }
        System.out.println(arr[idx]);
        display(arr , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ;i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        display( arr , 0);

    }
}
