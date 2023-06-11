package com.dataStructures.Recursion;

public class Palindrome {
    static String palindrome(String reversed){

        if(reversed.length() == 1){
            return reversed;
        }

        String subResult = palindrome(reversed.substring( 1));
        return subResult + reversed.charAt(0);
    }

    static boolean palindromeCheck(String original){
        return original.equalsIgnoreCase(palindrome(original));
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck("radar"));
    }
}
