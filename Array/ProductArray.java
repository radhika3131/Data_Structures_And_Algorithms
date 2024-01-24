package com.dataStructures.Array;

public class ProductArray {
    public static int[] findProduct(int[] arr)
    {
        int n = arr.length;
        int temp = 1;

        int[] result = new int[n];

// Product of elements on left side excluding arr[i]
        for(int i = 0 ; i<n ; i++)
        {
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;

        // Product of elements on right side excluding arr[i]
         for(int  i = n-1 ; i>= 0 ; i--)
         {
             result[i] = result[i]* temp;
             temp = temp * arr[i];
         }

         return result;
    }
    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

        // Test case 1
        int[] arr = {-1, 2, -3, 4, -5};
        System.out.println("Array before product: " + arrayToString(arr));
        int[] prodArray = findProduct(arr);
        System.out.println("Array after product: " + arrayToString(prodArray));

        // Test Case 2
        int[] arr1 = {2, 5, -4, 1, -5};
        System.out.println("Array before product: " + arrayToString(arr1));
        int[] prodArray1 = findProduct(arr1);
        System.out.println("Array after product: " + arrayToString(prodArray1));

        // Test case 3
        int[] arr2 = {-3, 4, 2, 4, -2};
        System.out.println("Array before product: " + arrayToString(arr2));
        int[] prodArray2 = findProduct(arr2);
        System.out.println("Array after product: " + arrayToString(prodArray2));

        // Test case 4
        int[] arr3 = {-4, 5, -2, 4, -1};
        System.out.println("Array before product: " + arrayToString(arr3));
        int[] prodArray3 = findProduct(arr3);
        System.out.println("Array after product: " + arrayToString(prodArray3));
    }
}
