package com.datastructures.RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
    //1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
    //2. The following list is the key to characters map :
    //    0 -> .;
    //    1 -> abc
    //    2 -> def
    //    3 -> ghi
    //    4 -> jkl
    //    5 -> mno
    //    6 -> pqrs
    //    7 -> tu
    //    8 -> vwx
    //    9 -> yz
    //3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
    //Use sample input and output to take idea about output.
    static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> a = getKPC(str);
        System.out.println(a);

    }
    public static ArrayList<String> getKPC(String str) {
       if(str.length() == 0)
       {
           ArrayList<String> a = new ArrayList<>();
           a.add(" ");
           return a;
       }

       ArrayList<String> val = getKPC(str.substring(1));
       int index = str.charAt(0) - '0';
       String s = arr[index];

       ArrayList<String> Myarr = new ArrayList<>();

       for(int i =0 ; i<s.length(); i++)
       {
           char ch = s.charAt(i);
           for(int j =0 ; j< val.size(); j++)
           {
               Myarr.add(ch + val.get(j));
           }
       }

       return Myarr;
    }

}
