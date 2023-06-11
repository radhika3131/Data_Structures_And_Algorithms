package com.dataStructures.Recursion;

import java.util.Scanner;

public class NaturalNumberSum {

    public static int Sum(int num) {
        if(num == 0)
        {
            return num;
        }
        else {
            return  num + Sum(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int SumNaturalNumber = Sum(number);
        System.out.println("Sum of N natura number is :" + SumNaturalNumber);
    }
}
