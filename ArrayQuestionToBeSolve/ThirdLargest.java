package com.dataStructures.ArrayQuestionToBeSolve;

public class ThirdLargest {
    public static void main(String[] args) {
        int arr[] = {10,20,90,100,1,44};
        // First Largest
        int firstLargest = 0; // 0th index
        int secondLargest = -1;
        int thirdLargest = -2;
        // get the first largest
        for(int i= 1; i<arr.length; i++){
            if(arr[i]>arr[firstLargest]){
                firstLargest = i;
            }
        }
        // now get the second largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[firstLargest]){
                if(secondLargest==-1){
                    secondLargest = i;
                }
                else if (arr[i]>arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }

        // now get the third larget
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[firstLargest] && arr[i] != arr[secondLargest]){
                if(thirdLargest==-2){
                    thirdLargest = i;
                }
                else if (arr[i]>arr[thirdLargest]){
                    thirdLargest = i;
                }
            }
        }

        System.out.println("First Largest "+arr[firstLargest]);
        System.out.println("Second Largest "+arr[secondLargest]);
        System.out.println("Third Largest "+arr[thirdLargest]);


    }
}
