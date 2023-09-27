package com.datastructures.RecursionAndBacktracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aLLIndex {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int size) {
        if(idx == arr.length)
        {
            int[] a = new int[size];
            return a;
        }

        if(arr[idx] == x)
        {
            size+=1;
        }

        int[] a = allIndices(arr , x , idx+1 , size);

        if(arr[idx] == x)
        {
            int index = size -1;
            a[index] = idx;
        }

        return a;

    }

}

