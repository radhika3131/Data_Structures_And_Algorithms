package com.dataStructures.Recursion;

import java.util.Scanner;

public class CountZeros {
    private static int count = 0;
    public static void countZeroes(int[] arr , int idx)
    {
        if(arr.length == idx) {
            return;
        }

        if(arr[idx] == 0)
        {
            count ++;
        }

        countZeroes(arr ,   idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();


        // converted this number into string
        String temp = Integer.toString(number);
        int[] newArray = new int[temp.length()];

        // then stored it in an array
        for (int i = 0; i < temp.length(); i++)
        {
            newArray[i] = temp.charAt(i) - '0';
        }

        System.out.println("Print that array:");
        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

        countZeroes(newArray , 0);
        System.out.println("Number of Zeroes are :" +count);
    }
}
