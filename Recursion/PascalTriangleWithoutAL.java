package com.dataStructures.Recursion;

import java.io.PrintStream;
import java.util.Scanner;

public class PascalTriangleWithoutAL {
    public static void Pattern(int numRows)
    {
        for(int i =0 ; i<numRows ; i++)
        {
            for(int k =0 ; k <numRows ;k++)
            {
                System.out.println("");
            }

            for(int j =0; j<= i ; j++)
            {
                System.out.println(Pascal(i,j)+"");
            }
            System.out.println();
        }
    }

    public static int Pascal(int row , int col)
    {
        if( col == 0 || row == col)
        {
            return 1;
        }
        else {

              return Pascal(row -1 , col -1) + Pascal(row -1 , col);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        Pattern(numRows);
    }
}
