package com.dataStructures.RecursionQuestionAssignment6;

import java.util.Scanner;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n==1)
        {
            return true;
        }
        else if ( n%3 != 0 || n <= 0)
        {
            return false;
        }

        boolean power = isPowerOfThree(n/3);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfThree( n));
    }
}
