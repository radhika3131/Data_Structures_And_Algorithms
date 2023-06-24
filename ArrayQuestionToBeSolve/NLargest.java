package com.dataStructures.ArrayQuestionToBeSolve;

import java.util.Arrays;

public class NLargest {
    public static int NthLargestElement(int arr[], int n, int N) {
        Arrays.sort(arr); // sorting the array
        return arr[n - N]; // return kth largest element
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 6, 3, 9, 7 };
        int n = arr.length;
        int N = 2;
        int x = NthLargestElement(arr, n, N);
        System.out.print("Nth largest element is " + x);
    }
}
