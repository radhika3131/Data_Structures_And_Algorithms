package com.dataStructures.BackTrackingPracticeQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateBrackets(result, n, 0, 0, sb);
        return result;
    }

    public static void generateBrackets(List<String> result , int n , int opening , int closing , StringBuilder output)
    {
        if(output.length() == 2*n)
        {
            result.add(output.toString());
            return;
        }

        // Can I place opening
        if(opening < n)
        {
            output.append("(");
            generateBrackets(result , n , opening+1 , closing , output);
            // stack fall
            output.deleteCharAt(output.length()-1); // Undo
        }

        // Can I place closing
        if(closing < opening )
        {
            output.append(")");
            generateBrackets(result , n , opening , closing+1 , output);
            // stack fall
            output.deleteCharAt(output.length()-1); // Undo
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> finalresult = generateParenthesis( n);
        System.out.println(finalresult);

    }
}
