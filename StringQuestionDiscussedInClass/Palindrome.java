package com.dataStructures.StringQuestionDiscussedInClass;

public class Palindrome {

    public static boolean isPalindrome(String str)
    {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return str.equals( rev.toString());
    }

    public static boolean palindrome(String str)
    {
        int low = 0;
        int high = str.length() - 1;

        while(low< high)
        {
            if(str.charAt(low) == str.charAt(high))
            {
                return true;
            }
            low++;
            high--;
        }

        return false;
    }


    public static void main(String[] args) {
        String str = "abba";

        System.out.println(palindrome(str));
        
    }
}
