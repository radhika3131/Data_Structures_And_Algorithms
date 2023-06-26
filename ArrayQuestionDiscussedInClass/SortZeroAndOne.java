package com.dataStructures.ArrayQuestionDiscussedInClass;

import java.util.Scanner;

public class SortZeroAndOne {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of array");
        for(int i =0 ; i< n ; i++) {
            arr[i] = sc.nextInt();
        }

        // Maintain a count variable for counting zeroes in the array
       int count = 0;
        for(int i =0; i< n ; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }

        // fill with zeroes
       for(int i = 0; i < count ; i++)
       {
           arr[i] = 0;
       }

       // fill with 1
       for(int i = count ; i<n ; i++)
       {
           arr[i] = 1;
       }

       /* print array arr[] */

           for (int i = 0; i < n; i++)
               System.out.print(arr[i] + " ");
           System.out.println("");
       }
   }

   //Time complexity O(n)
