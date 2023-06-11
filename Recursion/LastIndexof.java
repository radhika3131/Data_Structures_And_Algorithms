package com.dataStructures.Recursion;

import java.util.Scanner;

public class LastIndexof {
    public static int lastIndex(int[] arr , int element , int idx)
    {

        if(arr.length == idx)
        {
            return -1 ;
        }
             int liisa = lastIndex(arr , element , idx +1);
             if(liisa == -1)
             {
                 if(arr[idx] == element)
                 {
                     return idx;
                 }else {
                     return -1;
                 }
             }else {
                 return liisa;
             }
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

        System.out.println("Last index of element is "+ lastIndex(arr,element , 0));
    }
}
