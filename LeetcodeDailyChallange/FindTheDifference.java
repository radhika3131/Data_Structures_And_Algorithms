package com.dataStructures.LeetcodeDailyChallange;
import java.util.Arrays;
import java.util.Set ;
import java.util.HashSet;
import java.util.*;

public class FindTheDifference {
        public static char findTheDifference(String s, String t) {
            int[] count = new int[26];
            char[] S = s.toCharArray(), T = t.toCharArray();
            for(int i=0;i<S.length;i++) count[S[i]-'a']++;
            for(int i=0;i<T.length;i++) count[T[i]-'a']--;
            for(int i=0;i<26;i++) if(count[i] !=0) return (char)(i+'a');
            return '\0';
        }
        public static void main(String[] args) {
            String s="abcd",t="abcde";
            char ans=findTheDifference(s,t);
            System.out.println(ans);
        }

}
