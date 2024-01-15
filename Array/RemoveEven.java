package com.dataStructures.Array;

import java.util.Arrays;

public class RemoveEven {

    public static int[] remove_even(int[] arr) {
        int oddcount = 0;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddcount++;
            }
        }

        int[] result = new int[oddcount];
        int index = 0;

        for (int element : arr) {
            if (element % 2 != 0) {
                result[index++] = element;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(myArray1));
        myArray1 = remove_even(myArray1);
        System.out.println("After removing even elements: " + Arrays.toString(myArray1));

        // Test Case 2
        int[] myArray2 = {2, 4, 6, 8, 10};
        System.out.println("Original Array: " + Arrays.toString(myArray2));
        myArray2 = remove_even(myArray2);
        System.out.println("After removing even elements: " + Arrays.toString(myArray2));

        // Test Case 3
        int[] myArray3 = {1, 3, 5, 7, 9};
        System.out.println("Original Array: " + Arrays.toString(myArray3));
        myArray3 = remove_even(myArray3);
        System.out.println("After removing even elements: " + Arrays.toString(myArray3));
    }

}
