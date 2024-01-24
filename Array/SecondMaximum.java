package com.dataStructures.Array;

public class SecondMaximum {

    public static int findSecondMax(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Keep track of Maximum value, whenever the value at an array index is greater
        // than current Maximum value then make that max value 2nd max value and
        // make that index value maximum value
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static String arrayToString(int arr[]) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

        // Test case 1
        int[] arr = {-2, -33, -10, -456};

        System.out.println("Array: " + arrayToString(arr));

        int secMax = findSecondMax(arr);

        System.out.println("Second maximum: " + secMax);

        // Test case 2
        int[] arr2 = {12, -33, 76, -456};

        System.out.println("Array: " + arrayToString(arr2));

        int secMax2 = findSecondMax(arr2);

        System.out.println("Second maximum: " + secMax2);

        // Test case 3
        int[] arr3 = {18, 3, 0, 17};

        System.out.println("Array: " + arrayToString(arr3));

        int secMax3 = findSecondMax(arr3);

        System.out.println("Second maximum: " + secMax3);

    }
}
