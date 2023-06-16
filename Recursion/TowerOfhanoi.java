package com.dataStructures.Recursion;

import java.util.Scanner;

public class TowerOfhanoi {
    public static long moves = 0;
    public static void tower(int N , int from , int to , int aux )
    {
        if(N ==1)
        {
            System.out.println("move disk 1 from rod " +from+"to rod "+to);
            moves++;
            return;
        }
        tower(N-1 , from , aux , to );
        moves++;

        System.out.println("move disk "+N+" from rod " +from+"to rod "+to);

        tower(N-1 , aux , to , from);


    }

    public static long toh(int N, int from, int to, int aux) {

        tower(N , from , to , aux );
        return moves;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     System.out.println(toh(N , 1 , 2, 3));
    }
}
