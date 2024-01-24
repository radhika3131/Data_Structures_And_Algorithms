package com.dataStructures.Array;

public class MinimumValu {

    public static int minimum(int[] arr)
    {
        int n = arr.length;
        int min = arr[0];

        for(int i = 0 ; i< n ; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {

        // test case 1
        int[] arr = { 9, 2, 3, 6};

        System.out.print("Array : ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int min = minimum(arr);
        System.out.println("Minimum in the Array: " + min);

        // test case 2
        int[] arr2 = { 10, 6, 3, 12};

        System.out.print("Array : ");
        for(int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();

        int min2 = minimum(arr2);
        System.out.println("Minimum in the Array: " + min2);

        // test case 3
        int[] arr3 = { 8, -2, 3, 4};

        System.out.print("Array : ");
        for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
        System.out.println();

        int min3 = minimum(arr3);
        System.out.println("Minimum in the Array: " + min3);


    }
}
