package com.dataStructures.Recursion;

import java.util.Scanner;
//Given a String find the adjacent element if it is same as the previous element so replace the element with #.
//
//e.g "aabbcc"
//
//output a#b#c#
public class AdjacentElement2 {
    public static String result = " ";
    public static void replace(String str , int idx)
    {
        if(str.length() - 1 == idx)
        {
            return;
        }
        if(str.charAt(idx) == str.charAt(idx + 1))
        {
            result = result + str.charAt(idx);
            result = result + "#";
        }

        replace(str , idx + 1);
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();

      replace(str ,0);
      System.out.println(result);

    }
}
//Time complexity = O(n)