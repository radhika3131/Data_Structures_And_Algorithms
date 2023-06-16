package com.dataStructures.Recursion;

import java.util.Scanner;

public class JosephusProblem {
    public static int findTheWinner(int n, int k) {
        return findWinnerHelper(n, k ) + 1;
    }

    private static int findWinnerHelper(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return  (findWinnerHelper(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Winner of the game " + findTheWinner( n,  k));
    }
}
