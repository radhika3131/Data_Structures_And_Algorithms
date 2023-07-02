package com.dataStructures.StringQuestionDiscussedInClass;

import java.util.ArrayList;

public class PrefixAndSuffix {
    public static ArrayList<String> suffix(String str)
    {
        ArrayList<String> ar = new ArrayList<>();
        for(int i =0 ; i<ar.size() ; i++)
        {
              ar.set(i, str.substring(ar.size() - 1 - i));
        }
       return ar;
    }
    public static void main(String[] args) {
        String str = "apple";
        ArrayList<String> result =  suffix(str);
        System.out.println(result);
    }
}
