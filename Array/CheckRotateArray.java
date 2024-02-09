package com.dataStructures.Array;

public class CheckRotateArray {

    public static void rotateArray(int[] arr)
    {
        int n = arr.length;
        int lastelement = arr[n-1];

        for(int i = n-1 ; i>0 ; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = lastelement;
    }

    public static void main(String args[]) {

        // test case 1
        int[] arr = {3, 6, 1, 8, 4, 2};

        System.out.print("Array before rotation: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rotateArray(arr);

        System.out.print("Array after rotation: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // test case 2
        int[] arr2 = {2, 9, 1, -8, 4, -3};

        System.out.print("\n Array before rotation: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        rotateArray(arr2);

        System.out.print("Array after rotation: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // test case 3
        int[] arr3 = {10, 6, 1, -2, 4, 2 , 11};

        System.out.print("\n Array before rotation: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        rotateArray(arr3);

        System.out.print("Array after rotation: ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }


    }


}
