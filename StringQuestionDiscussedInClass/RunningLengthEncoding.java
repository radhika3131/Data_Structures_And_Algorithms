package com.dataStructures.StringQuestionDiscussedInClass;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class RunningLengthEncoding {

    public static void Encoding(String str)
    {
        int count = 1;
        for(int i =0 ; i<str.length() ; i++)
        {
            while(i<str.length() -1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }

            System.out.print(str.charAt(i) +","+  count +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       Encoding(str);
    }
}
