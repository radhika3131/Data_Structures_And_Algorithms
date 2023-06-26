package com.dataStructures.ArrayQuestionDiscussedInClass;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of array");
        for(int i =0 ; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search ");
        int search = sc.nextInt();

        int low =0;
        int high = arr.length - 1;
        int mid =0;
        while(low<high){
            mid = (low+high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found at "+ mid);
                return ;
            }
            if(search>arr[mid]){
                low = mid + 1;
            }
            else if (search<arr[mid]){
                high = mid -1 ;
            }
        }
        System.out.println("Element Not Found...");
    }
}
