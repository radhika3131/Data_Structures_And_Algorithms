package com.datastructures.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
// 1. You are given a string str.
//2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
//Use sample input and output to take idea about subsequences.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> a= gss(str);
        System.out.println(a);

    }

    public static ArrayList<String> gss( String str)
    {
        // base condition
        if(str.length() == 0)
        {
            ArrayList<String> a = new ArrayList<>();
            a.add(" ");
            return a;
        }

        ArrayList<String> val= gss(str.substring(1));
        ArrayList<String> Myarr = new ArrayList<>();
        char ch = str.charAt(0);

        // not pick

        for(int i =0 ; i< val.size() ; i++)
        {
            Myarr.add(val.get(i));
        }

        //pick

        for(int i =0 ; i< val.size() ; i++)
        {
            Myarr.add(ch + val.get(i));
        }

        return Myarr;

    }


}
