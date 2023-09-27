package com.datastructures.RecursionAndBacktracking;

import java.util.Scanner;

public class printDecreasing {
    public static void printdecreasing(int a)
    {
        if(a < 0)
            return ;
        System.out.println(a);
        a--;
        printdecreasing(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printdecreasing(n);
    }
}
