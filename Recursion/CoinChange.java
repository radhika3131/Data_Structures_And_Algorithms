package com.dataStructures.Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CoinChange {
    public static void coinChange(int i, int[] coins, int amtsf, int tamt, String asf) {
        if (i == coins.length) { //1
            if (amtsf == tamt) {
                System.out.println(asf + ".");
            }
            return;
        }

        for (int j = tamt / coins[i]; j >= 1; j--) { //2

            String part = "";
            for (int k = 0; k < j; k++) { //3
                 part+=coins[i]+"-";
              }

            coinChange(i + 1, coins, amtsf + coins[i]*j, tamt, asf + part); //4
             }
           coinChange(i + 1, coins, amtsf, tamt, asf); //5
         }
         public static void main(String[] args) throws Exception {
         Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        coinChange(0, coins, 0, amt, "");
    }
}
