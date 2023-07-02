package com.dataStructures.StringQuestionDiscussedInClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramArray {

    public static void anagram(String[] arr)
    {
        // make the copy of an array
        String[] newArr = new String[arr.length];
        for(int i =0 ; i<arr.length ; i ++)
        {
            newArr[i] = arr[i];

        }

        int index =0;
        for(String word : newArr)
        {

        }
        for(int i =0 ; i<newArr.length ; i++)
        {
            if(newArr[i] == newArr[i+1])
            {
                System.out.println(newArr[i]+" "+newArr[i+1]);
            }
        }
    }

    public static void main(String[] args) {
      String[] arr = {"act" , "dog" , "cat" , "god"};
      anagram(arr);
    }
}
