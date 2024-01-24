package com.dataStructures.Array;

public class CheckFirstUnique {
    public static int findUnique(int[] arr)
    {
        //Inside Inner Loop Check Each index of outerLoop If it's repeated in array
        //If it's not repeated then return this as first unique Integer
        int n = arr.length;
        boolean isRepeated = false;

        for(int i = 0; i < n; i++) {

        for (int j = 0; j < n; j++) {

            if (arr[i] == arr[j] && i != j) {
                isRepeated = true;
                break;
            }
        } //end of InnerLoop

        if (isRepeated == false) {
            return arr[i];
        }
        else {
            isRepeated = false;
        }

    } //end of OuterLoop
        return - 1;
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

    public static void  main(String args[]) {

        int[] arr = {2, 54, 7, 2, 6, 54};

        System.out.println("Array: " + arrayToString(arr));

        int unique = findUnique(arr);
        System.out.print("First Unique in an Array: " + unique);

    }
}
