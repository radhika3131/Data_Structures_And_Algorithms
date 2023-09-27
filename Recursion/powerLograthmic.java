package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class powerLograthmic {
    // time complxity is O(logn)
    public static int power(int x , int n)
    {
        if( n== 0)
        {
            return 1;
        }
        int temp = power(x, n/2);
        int ans = temp * temp;
        if(n % 2 != 0)
        {
            ans *= x;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("logarithmic power is :");
        System.out.println(power(x,n));

    }
}
