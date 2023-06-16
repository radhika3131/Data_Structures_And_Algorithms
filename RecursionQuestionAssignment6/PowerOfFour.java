package com.dataStructures.RecursionQuestionAssignment6;

import java.util.Scanner;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n==1)
        {
            return true;
        }

        else if ( n%4 != 0 || n == 0)
        {
            return false;
        }

        boolean power = isPowerOfFour(n/4);
        return power ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfFour( n));
    }
}
