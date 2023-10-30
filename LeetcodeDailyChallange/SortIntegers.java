package com.dataStructures.LeetcodeDailyChallange;

import java.util.Arrays;

public class SortIntegers {
    public static int[] sortByBits(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
            arr[i]+=10001*Integer.bitCount(arr[i]);
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
            arr[i]=arr[i]%10001;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {7,1,6,5};
        int[]ans=sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }
}
