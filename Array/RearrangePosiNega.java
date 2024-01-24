package com.dataStructures.Array;

public class RearrangePosiNega {
    /*
    public static void reArrange(int[] arr)
    {
        // Time complexity -O(n)
        // Space Complexity - O(n)
        int n = arr.length;
        int[] newArr = new int[n];
        int newArrIndex = 0;

        //Fill newArray with Negative Values first.
        //Then fill it with postive values.
        //In the end, insert every element of newArray back into original arr.
        for(int i = 0; i< n ; i++)
        {
          if(arr[i] < 0)
          {
              newArr[newArrIndex++] = arr[i];
          }
        }

        for(int i = 0; i<n ; i++)
        {
            if(arr[i] >= 0)
            {
                newArr[newArrIndex++] = arr[i];
            }
        }

        for (int j = 0; j < newArrIndex; j++) {
            arr[j] = newArr[j];
        }

    }

     */

    public static void optimizedreArrange(int[] arr)
    {
        int n = arr.length;
        int j = 0;

        for(int i =0; i< n ;i++)
        {
            if(arr[i] < 0)
            {
                if(i!=j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];   // swapping with leftmost positive
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String args[]) {

        int[] arr = {2, 4, -6, 8, -5, -10};

        System.out.print("Array before re-arranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        optimizedreArrange(arr);

        System.out.print("Array after rearranging: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


    }
}
