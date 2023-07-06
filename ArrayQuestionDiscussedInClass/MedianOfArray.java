package com.dataStructures.ArrayQuestionDiscussedInClass;

public class MedianOfArray {


    public static int[] MergeTwoArray(int[] arr1 , int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2 ;
        int[] newArray = new int[n3];
        int i =0, j =0, k =0;


        while(i<n1 && j< n2) {
            if(i == n1 -1)
            {
                while(j<n2){
                    newArray[k++] = arr2[j++];
                    break;
                }

            }
            else if (j == n2-1) {

                while(i<n1) {
                    newArray[k++] = arr1[i++];
                    break;
                }
            }

            if (arr1[i] < arr2[j]) {
                newArray[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                newArray[k] = arr2[j];
                j++;
                k++;
            }



        }

        return newArray;

    }

    public static void Median(int[] arr1 , int[] arr2)
    {
        int[] result = MergeTwoArray(arr1 , arr2);
        int n = result.length;

        int median;
        if(n%2 == 0)
        {
            median  = (result[n/2 - 1] + result[n/2 ])/2;
            System.out.println(median);

        }
        else
        {
            median = result[n/2 - 1];
            System.out.println(median);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        Median(arr1 , arr2);

    }
}
