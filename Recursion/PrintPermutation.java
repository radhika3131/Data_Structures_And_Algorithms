package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) throws Exception {
             Scanner sc = new Scanner(System.in);
             String str = sc.nextLine();
          printPermutation(str , " ");

    }

    public static void printPermutation(String str, String asf) {

        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        for(int i =0 ; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            String  left = str.substring(0,i);
            String right = str.substring(i+1);
            String roq = left + right ;

            printPermutation(roq , asf + ch);

        }
    }
}
