package com.dataStructures.Recursion;

public class repalceDuplicate {
    static char ch = '#';
    static String result = "";

    public static String replace(String str, int i) {
        if (i == str.length()) {
            return result;
        }
        if (i == 0) {
            result = result + str.charAt(i);
        }

        if (i != 0) {
            if (str.charAt(i) == result.charAt(i - 1)) {
                result = result + "#";
            } else {
                result = result + str.charAt(i);
            }
        }

        return replace(str, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(replace("aabbcc", 0));
    }
}
