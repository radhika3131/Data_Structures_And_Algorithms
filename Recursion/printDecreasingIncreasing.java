package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class printDecreasingIncreasing {
    public static void print(int a)
    {
        if(a == 0)
            return ;
        System.out.println(a);

        print(a-1);
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        print(n);
    }
}
