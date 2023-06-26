package com.dataStructures.ArrayQuestions;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DNFProblem {
   public static int[] nums = {};
    public static void swap(int firstNumber , int SecondNumber)
    {
        int temp = nums[firstNumber];
        nums[firstNumber] = nums[SecondNumber];
        nums[SecondNumber] = temp;

    }

     public static void DNF(int[] arr)
    {
        nums = arr;
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid<= high) {
            int value = arr[mid];
            switch (value) {
                case 0:
                    swap(low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    swap(mid, high);
                    high--;
                    break;

            }
        }

    }
    /*function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
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
        DNF(arr);
        printArray(arr,n);




    }
}
