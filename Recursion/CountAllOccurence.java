package com.dataStructures.Recursion;

import java.util.Scanner;

public class CountAllOccurence {

    private static int count = 0;
     public static void countOccurence(int[] arr , int element , int idx)
    {
        if(arr.length == idx) {
            return;
        }

        if(arr[idx] == element)
        {
            count ++;
        }

        countOccurence(arr , element , idx+1);
     }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i =0 ; i< n ; i++)
        {
            arr[i] = scn.nextInt();
        }
        int element = scn.nextInt();
        countOccurence(arr , element , 0);
        System.out.println(count);
    }
}
