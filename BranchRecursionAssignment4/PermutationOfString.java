package com.dataStructures.BranchRecursionAssignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {
    static ArrayList<String> permutation(String str) {
        if(str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char firstChar = str.charAt(0);
        String remaningString = str.substring(1);
        ArrayList<String> temp = permutation(remaningString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, firstChar);
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String>finalresult = permutation(str);
        System.out.println("Permuation of the String :" +finalresult);
    }
}
