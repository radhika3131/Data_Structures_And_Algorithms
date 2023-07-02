package com.dataStructures.StringQuestionDiscussedInClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static boolean anagram(String s1 , String s2)
    {



        char[] string1 = s1.toCharArray();
        char[] string2 = s2.toCharArray();

        // sort both the arrays
        Arrays.sort(string1);
        Arrays.sort(string2);

        for(int i =0; i<string1.length; i++)
        {
            for(int j =0 ; j<string2.length ; j++)
            {
                if(string1[i] == string2[j])
                {
                    return true;
                }
            }
        }

        return false;

    }
    public static void main(String[] args) {

        String str1 = "push";
        String str2 = "sush";
        System.out.println(anagram(str1 , str2));
    }
}
