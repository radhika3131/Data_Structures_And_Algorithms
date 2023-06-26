package com.dataStructures.ArrayQuestionDiscussedInClass;

import java.util.Scanner;

public class RotateArray  {
    public static void reverse(int[] arr ,int low , int high)
    {

        while(low< high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high --;
        }
    }

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

        System.out.println("Enter number of rotation:");
        int k = sc.nextInt();

        //Rotation must be in range
        k = k%arr.length;
        // if rotation is negative
        if(k<0)
        {
            k = arr.length+k;
        }

        //reverse first part
        reverse(arr , 0 , arr.length -k -1 );
        //reverse second part
        reverse(arr , arr.length- k , arr.length-1 );
        // reverse full array
        reverse(arr , 0 , arr.length-1);


        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
