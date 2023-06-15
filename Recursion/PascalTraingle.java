package com.dataStructures.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTraingle {

    public  static List<List<Integer>> generate(int numRows) {

        if(numRows == 0)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0 ; i< numRows ; i++)
        {
            List<Integer> temp = new ArrayList<>();

            for(int j =0 ;j<= i ; j++){

                if( j == 0 || j == i)
                {
                    temp.add(1);
                }
                else
                {
                    temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }

            result.add(temp);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        List<List<Integer>> ans = generate(numRows);
        System.out.println(ans);
    }
}
