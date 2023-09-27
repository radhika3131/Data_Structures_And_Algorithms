package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class PrintEncoding {
    //1. You are given a string str of digits. (will never start with a 0)
    //2. You are required to encode the str as per following rules
    //    1 -> a
    //    2 -> b
    //    3 -> c
    //    ..
    //    25 -> y
    //    26 -> z
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str , " ");

    }

    public static void printEncodings(String str , String ans) {

        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        else if(str.length() == 1)
        {
            if(str.charAt(0) == '0')
            {
                return;
            }
            else
            {
                String ch0 = str.substring(0,1);
                String roq = str.substring(1);
                String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";

                printEncodings(roq , ans + code0);


            }
        }

        else
        {
            if(str.charAt(0) == '0')
            {
                return;
            }
            else
            {
                // pick ist character
                String ch0 = str.substring(0,1);
                String roq = str.substring(1);
                String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";

                printEncodings(roq , ans + code0);


                // pick first two character
                String ch1 = str.substring(0,2);
                String roq1 = str.substring(2);
                String code1 = (char)('a' + (Integer.parseInt(ch1) - 1)) + "";

                if(Integer.parseInt(ch1) <= 26)
                printEncodings(roq1 , ans + code1);

            }
        }

    }
}
