package com.dataStructures.Recursion;

import java.util.Scanner;

public class PrintSeries {
    public static long sum(int n) {
        // 1/1^1 = 1
        if( n == 1)
        {
            return n;
        }
        else {
            return ((n / (long) Math.pow(n, n)) + sum(n - 1));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
