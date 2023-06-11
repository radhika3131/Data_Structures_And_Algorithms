package com.dataStructures.Recursion;

import java.util.Scanner;

public class ArmstrongNo {
    static int countDigits(int num, int count) {
        if (num == 0) {
            return 0;
        }

        count = countDigits(num / 10, count);
        return ++count;
    }

    static void armstrong(int orgNum, int num, int result, int digits) {

        if (num == 0) {
            if (orgNum == result) {
                System.out.println(" An armstrong number");
            } else {
                System.out.println("A non-armstrong number ");
            }

            return;
        }
        result += (int) Math.pow((num % 10), digits);
        armstrong(orgNum, num / 10, result, digits);
    }

    static void armstrong(int num) {
        int digits = countDigits(num, 0);
        armstrong(num, num, 0, digits);
    }


    static int armstrong_2(int num, int digits) {
        if (num == 0) {
            return 0;
        }

        int result = (armstrong_2(num / 10, digits));
        result += (int) Math.pow(num % 10, digits);
        return result;
    }

    static boolean armstrong_2(int num) {
        int digits = countDigits(num, 0);
        return num == armstrong_2(num, digits);
    }

    public static void main(String[] args) {
        armstrong(153);
    }
}
