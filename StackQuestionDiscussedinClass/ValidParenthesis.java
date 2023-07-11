package com.dataStructures.StackQuestionDiscussedinClass;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack();

        for(int i =0; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch== '[')
            {
                stack.push(ch);
            }
            else {

                if(stack.isEmpty())
                {
                    return false;
                }
                else if(!Pair(stack.peek(),ch))
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }

            }

        }
        return true;

    }
    public static boolean Pair(char a , char b)
    {
        if(a == '(' && b == ')')
        {
            return true;
        }
        if(a == '[' && b == ']')
        {
            return true;
        }
        if(a == '{' && b == '}')
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
     String s = "{[(])}";
     System.out.println(isValid(s));
    }
}
