package com.dataStructures.Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean power(int n)
    {
        if( n==1)
        {
            return true;
        }
        if( n% 2 == 0)
        {
           return  power(n/2);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            boolean result = power(n);
            System.out.println(result);
    }
}
