package com.dataStructures.Recursion;
import java.util.Scanner;
public class GetClimbing {
 public static int climb(int n)
 {
     if( n ==1 || n == 2)
     {
         return n;
     }
     return climb(n-1) + climb(n-2);
 }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Number of ways :"+climb(n));
    }
}
