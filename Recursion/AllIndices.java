package com.dataStructures.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AllIndices {
 public static int[] allIndices(int[] arr , int element , int idx ,int size)
 {
    ;
     if(arr.length == idx)
     {
         int[] newArr = new int[size];
         return newArr;
     }
     if(arr[idx] == element)
     {
         size++;
     }

    int[] newArr =  allIndices(arr , element , idx + 1 , size);

     if(arr[idx] == element)
     {
       int index = size -1;
       newArr[index] = idx;
     }
     return newArr;

 }
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] iarr = allIndices(arr, x, 0 , 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
}
