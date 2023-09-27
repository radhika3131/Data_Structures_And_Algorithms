package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int a)
    {
        if( a == 1)
        {
            return 1;
        }
        int fact = a * factorial(a-1);
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println(f);

    }
}
