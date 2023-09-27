package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class LastIndex {

    public static int lastindex(int[] arr , int idx , int x)
    {
        if(idx == arr.length)
        {
            return -1;
        }
       int liisa =  lastindex(arr , idx +1 , x);
       if(liisa == -1)
        {
            if(arr[idx] == x)
            {
                return idx;
            }
            else {
                return -1;
            }

        }
       else {
           return liisa;
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

        int temp = lastindex(arr , 0 , x );
        System.out.println(temp);
    }
}
