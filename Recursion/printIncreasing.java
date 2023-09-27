package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class printIncreasing {
    public static void printincreasing(int a)
    {
        if(a == 0)
        {
            return;
        }
        a--;
        printincreasing(a);
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printincreasing(n);
    }
}
