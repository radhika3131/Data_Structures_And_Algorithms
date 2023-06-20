package com.dataStructures.BacktrackingDiscussedInClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination {
    String  phoneKeys[] ={"","","abc","def", "ghi","jkl","mno","pqrs","tuv","wxyz" };

    public static List<String> letterCombinations(String digits) {
        if(digits.length() ==0){
            List<String> list = new ArrayList<>();
            return list;
        }
        return letterCombinationsHelper(digits);
    }

    public List<String> letterCombinationsHelper(String digits) {

        if(digits.length() == 0)
        {
            List<String> a = new ArrayList<>();
            a.add("");
            return a;
        }

        // get the first character of the string i.e digits
        char firstChar = digits.charAt(0);
        // then convert that char into integer
        int index = firstChar - '0';
        String phoneKey = phoneKeys[index];
        String remString = digits.substring(1);
        List<String> finalList = new ArrayList<>();

        for(int i =0 ; i<phoneKey.length() ; i++)
        {
            List<String> result = letterCombinationsHelper(remString);
            for(String s : result){
                finalList.add(phoneKey.charAt(i) + s);
            }
        }

        return finalList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();
        List<String> ans = letterCombinations( digits);

    }
}
