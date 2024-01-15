package com.dataStructures.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbersAddUpToK {

    //Brute force :- TC O(n^2)
    /*
    public static int[] sum(int[] arr , int k)
    {
        int n = arr.length;
        for(int i =0; i< n ; i++)
        {
            for(int j =0; j<n ; j++)
            {
                if((arr[i] + arr[j]) == k  &&  i != j)
                {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }
*/
    //Time complexity - O(n)
    static int[] findTwoNumbersOptimized(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{complement, arr[i]};
            }

            map.put(arr[i], i);
        }

        return null;
    }
    static void testTwoNumbersSum(int[] arr, int targetSum) {
        int[] result = findTwoNumbersOptimized(arr, targetSum);

        if (result != null) {
            System.out.println("For target sum " + targetSum + ": Two numbers found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("For target sum " + targetSum + ": No such numbers found.");
        }
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] myArray1 = {1, 3, 5, 7, 9, 11};
        int targetSum1 = 16;
        testTwoNumbersSum(myArray1, targetSum1);

        // Test Case 2
        int[] myArray2 = {2, 4, 6, 8, 10};
        int targetSum2 = 12;
        testTwoNumbersSum(myArray2, targetSum2);

        // Test Case 3
        int[] myArray3 = {3, 8, 12, 5, 6, 14};
        int targetSum3 = 20;
        testTwoNumbersSum(myArray3, targetSum3);

        // Test Case 4
        int[] myArray4 = {1, 2, 3, 4, 5};
        int targetSum4 = 10;
        testTwoNumbersSum(myArray4, targetSum4);
    }

}
