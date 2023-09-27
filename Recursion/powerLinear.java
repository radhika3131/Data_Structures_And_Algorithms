package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Linear power is :");
        System.out.println(power(x,n));

    }

    public static int power(int x, int n){
        if( n==0) {
            return 1;
        }

        int y = power(x , n-1)*x;
        return y;
    }
}
