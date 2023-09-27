package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class printzigZag {
    public static void printzz(int n )
    {
        if( n == 0)
        {
            return;
        }

        System.out.println(n + " ");
        printzz(n-1);
        System.out.println(n + " ");
        printzz(n-1);
        System.out.println(n + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        printzz(n);
    }
}
